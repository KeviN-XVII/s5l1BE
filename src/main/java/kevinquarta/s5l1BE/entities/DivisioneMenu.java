package kevinquarta.s5l1BE.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DivisioneMenu {

    private String name;
    private int calorie;
    private double prezzo;

    public DivisioneMenu(String name, int calorie, double prezzo) {
        this.name = name;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return name;
    }
}
