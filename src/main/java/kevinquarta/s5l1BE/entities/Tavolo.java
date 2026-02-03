package kevinquarta.s5l1BE.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {

    private int numTavolo;
    private int maxCoperti;
    private StatoTavolo statoTavolo;

    public Tavolo(int numTavolo, int maxCoperti) {
        this.numTavolo = numTavolo;
        this.statoTavolo = StatoTavolo.LIBERO;
        this.maxCoperti = maxCoperti;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numTavolo=" + numTavolo +
                ", maxCoperti=" + maxCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
