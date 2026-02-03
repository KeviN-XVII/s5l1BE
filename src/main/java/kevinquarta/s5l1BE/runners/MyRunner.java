package kevinquarta.s5l1BE.runners;

import kevinquarta.s5l1BE.S5l1BeApplication;
import kevinquarta.s5l1BE.entities.DivisioneMenu;
import kevinquarta.s5l1BE.entities.Menu;
import kevinquarta.s5l1BE.entities.Tavolo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

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
        List<DivisioneMenu> ciboOrdinato = List.of(menu.get)









        System.out.println("------------Fine Runner-------------");
    }
}
