package kevinquarta.s5l1BE.config;


import kevinquarta.s5l1BE.entities.Bevande;
import kevinquarta.s5l1BE.entities.Menu;
import kevinquarta.s5l1BE.entities.Pizze;
import kevinquarta.s5l1BE.entities.Toppings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {
//INGREDIENTI
     @Bean
     public Toppings tomato() {
    return new Toppings("Pomodoro",0,0);
     }
    @Bean
    public Toppings cheese() {
        return new Toppings("Formaggio",92,0.69);
    }
    @Bean
    public Toppings ham() {
        return new Toppings("Salumi",35,0.99);
    }
    @Bean
    public Toppings onions() {
        return new Toppings("Cipolla",22,0.69);
    }
    @Bean
    public Toppings pineapple() {
        return new Toppings("Ananas",24,0.79);
    }
    @Bean
    public Toppings salami() {
        return new Toppings("Salami",86,0.99);
    }

//BEVANDE

    @Bean
    public Bevande lemonade() {
        return new Bevande("Limonata(0.33l)",128,1.29);
    }
    @Bean
    public Bevande water() {
        return new Bevande("Acqua(0.5l)",0,1.29);
    }
    @Bean
    public Bevande wine() {
        return new Bevande("Vino(0.75l,13%)",607,7.49);
    }

//PIZZE

    @Bean
    public Pizze margherita() {
        return new Pizze("Pizza Margherita",1104,4.99, List.of(cheese(),tomato()));
    }
    @Bean
    public Pizze hawaiian() {
        return new Pizze("Pizza Hawaiiana",1024,6.49,List.of(cheese(),tomato(),pineapple()));
    }
    @Bean
    public Pizze salamiPizza() {
        return new Pizze("Pizza Salami",1160,5.99,List.of(cheese(),tomato(),salami()));
    }


//MENU

//    @Bean
//    public Menu menu() {
//        return new Menu(
//                List.of(margherita(), hawaiian(),salamiPizza()),
//                List.of(tomato(),cheese(), ham(),onions(), pineapple(),salami()),
//                List.of(lemonade(),water(),wine())
//        );
//    }

    @Bean
    public double getCoperto(@Value("${prezzo.coperto}")double prezzoCoperto){
         return prezzoCoperto;
    }


}
