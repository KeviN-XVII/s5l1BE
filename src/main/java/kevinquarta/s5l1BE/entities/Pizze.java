package kevinquarta.s5l1BE.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Pizze extends DivisoneMenu {

    private List<Toppings> toppings;

    public Pizze(String name,int calorie,double prezzo,List<Toppings> toppings){
        super(name,calorie,prezzo);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
       return getName() +
                " (" + toppings.toString() + ")"+
                " | Calorie: " + getCalorie() +
                " | Prezzo: " + getPrezzo();
    }


}
