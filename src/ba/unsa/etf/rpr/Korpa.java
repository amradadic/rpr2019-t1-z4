package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Artikl> artikli = new ArrayList<>();
    int brojac = 0;
    public Korpa(ArrayList<Artikl> artikli) {
        this.artikli = artikli;
    }

    public Korpa() {
    }
}
