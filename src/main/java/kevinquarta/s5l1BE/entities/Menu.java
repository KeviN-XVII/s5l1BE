package kevinquarta.s5l1BE.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {

    private List<Pizze> pizzas;
    private List<Toppings> toppings;
    private List<Bevande> bevande;

    @Autowired
    public Menu(List<Pizze>pizzas, List<Toppings> toppings, List<Bevande> bevande) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.bevande = bevande;
    }

    public void printMenu() {
        System.out.println("-----------------MENU PIZZERIA------------------");

        System.out.println("-----------------PIZZE------------------");
        pizzas.forEach(p-> System.out.println(p));
        System.out.println("-----------------INGREDIENTI------------------");
        toppings.forEach(i ->
                System.out.println(i.getName() +
                        " | Calorie: " + i.getCalorie() +
                        " | Prezzo: " + i.getPrezzo()));
        System.out.println("-----------------BEVANDE------------------");
        bevande.forEach(b ->
                System.out.println(b.getName() +
                        " | Calorie: " + b.getCalorie() +
                        " | Prezzo: " + b.getPrezzo()));


    }

}
