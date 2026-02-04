package kevinquarta.s5l1BE;

import kevinquarta.s5l1BE.entities.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class S5l1BeApplicationTests {
	@Autowired
	private static AnnotationConfigApplicationContext ctx;


	@BeforeAll
	static void beforeAll() {
		System.out.println("BEFORE ALL");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("AFTER ALL");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("BEFORE EACH");
	}

	@AfterEach
	void afterEach() {
		System.out.println("AFTER EACH");
	}


//	TEST 1 CREAZIONE ORDINE
	@Test
	void testCreazioneOrdine() {

		Tavolo tavolo = new Tavolo(5,3);

		DivisioneMenu pizza = new Pizze("Margherita",1200,4.5, List.of());

		Ordine ordine = new Ordine(1,tavolo,List.of(pizza),StatoOrdine.PRONTO,2,2);

		assertNotNull(ordine);
	}

//TEST 2 PREZZO TOTALE
	@Test
	void testPrezzoTotale(){
		Tavolo tavolo = new Tavolo(5,3);

		DivisioneMenu pizza = new Pizze("Margherita",1200,4.5, List.of());

		Ordine ordine = new Ordine(1,tavolo,List.of(pizza),StatoOrdine.PRONTO,2,2);

		assertEquals(8.50,ordine.getPrezzoTot());

	}
//	TEST 3 PIZZE

	@Test
	void testPizze(){
		Pizze margherita = new Pizze("Margherita",1200,4.5, List.of());
		Pizze patatine = new Pizze("Patatine",1300,6.5, List.of());

		assertNotSame(margherita,patatine);
	}


//	TEST 4
	@Test
	void testSizeList(){
		Toppings tomato = new Toppings("tomato",60,0.69);
		Toppings cheese = new Toppings("cheese",80,1.49);
		Toppings salami = new Toppings("salami",120,5.49);
		List<Toppings> toppings = new ArrayList<>(List.of(tomato,cheese,salami));

		assertNotEquals(0,toppings.size());
		assertNotEquals(1,toppings.size());
		assertNotEquals(2,toppings.size());
		assertEquals(3,toppings.size());
		assertNotEquals(4,toppings.size());

	}



//	TEST 5 CON PARAMETRI
	@ParameterizedTest
	@CsvSource({
			"7.0, 1, 1.0, 8.0",
			"8.5, 2, 1.5, 11.5",
			"10.0, 3, 2.0, 16.0"
	})
	void testPrezzoTotaleParams(
			double prezzoPizza,
			int coperti,
			double prezzoCoperto,
			double totale
	) {
		Tavolo tavolo = new Tavolo(1, coperti);

		DivisioneMenu pizza = new Pizze(
				"Test",
				800,
				prezzoPizza,
				List.of()
		);

		Ordine ordine = new Ordine(
				1,
				tavolo,
				List.of(pizza),
				StatoOrdine.PRONTO,
				coperti,
				prezzoCoperto
		);

		assertEquals(totale, ordine.getPrezzoTot());
	}

}
