package kevinquarta.s5l1BE.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toppings extends DivisoneMenu {
    public Toppings(String name, int calorie, double prezzo) {
        super(name, calorie, prezzo);
    }
}
