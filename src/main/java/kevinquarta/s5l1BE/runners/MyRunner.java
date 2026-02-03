package kevinquarta.s5l1BE.runners;

import kevinquarta.s5l1BE.S5l1BeApplication;
import kevinquarta.s5l1BE.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------Inizio Runner-----------");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S5l1BeApplication.class);

        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();

        Tavolo tavolo = new Tavolo(1,5);
        DivisioneMenu margherita = ctx.getBean("margherita",DivisioneMenu.class);
        DivisioneMenu acqua = ctx.getBean("water",DivisioneMenu.class);
        DivisioneMenu vino = ctx.getBean("wine",DivisioneMenu.class);

        List<DivisioneMenu> piattiOrdinati = new ArrayList<>(
                List.of(margherita,acqua,vino)
        );

        System.out.println("------ORDINE-------");
        Ordine ordine = new Ordine(1,tavolo,piattiOrdinati, StatoOrdine.PRONTO,5,1);
        System.out.println(ordine);
        System.out.println("------TOTALE DA PAGARE-------");
        System.out.println("TOT DA PAGARE : " + ordine.getPrezzoTot());

        System.out.println("------------Fine Runner-------------");
    }
}
