package kevinquarta.s5l1BE.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;


@Getter
@Setter
public class Ordine {

    private int numOrdine;

    private Tavolo tavolo;

    private List<DivisioneMenu> ciboOrdinato;

    private StatoOrdine statoOrdine;

    private int numCoperti;

    private LocalTime orario;

    private double prezzoTot;

    public Ordine(int numOrdine, Tavolo tavolo, List<DivisioneMenu> ciboOrdinato, StatoOrdine statoOrdine, int numCoperti, double prezzoCoperto) {
        this.numOrdine = numOrdine;
        this.tavolo = tavolo;
        this.ciboOrdinato = ciboOrdinato;
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.numCoperti = numCoperti;
        this.orario = LocalTime.now();
        this.prezzoTot = ciboOrdinato.stream().mapToDouble(DivisioneMenu::getPrezzo).sum()+(numCoperti*prezzoCoperto);

        tavolo.setStatoTavolo(StatoTavolo.OCCUPATO);
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numOrdine=" + numOrdine +
                ", tavolo=" + tavolo +
                ", ciboOrdinato=" + ciboOrdinato +
                ", statoOrdine=" + statoOrdine +
                ", numCoperti=" + numCoperti +
                ", orario=" + orario +
                ", prezzoTot=" + prezzoTot +
                '}';
    }
}
