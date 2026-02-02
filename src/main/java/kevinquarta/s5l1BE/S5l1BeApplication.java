package kevinquarta.s5l1BE;

import kevinquarta.s5l1BE.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S5l1BeApplication {

	public static void main(String[] args) {

		SpringApplication.run(S5l1BeApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S5l1BeApplication.class);

		Menu menu = ctx.getBean(Menu.class);
		menu.printMenu();


	}

}
