package exercice;

import bandeau.Bandeau;

public class Clignoter extends Effet {

    public void excecuter(Bandeau b) {
        b.setMessage("Clignotant");
        b.sleep(100);
        b.setMessage("");
        b.sleep(100);

    }
}
