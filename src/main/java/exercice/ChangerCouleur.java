package exercice;

import java.awt.Color;
import java.util.Random;

import bandeau.Bandeau;

public class ChangerCouleur extends Effet {
    public void excecuter(Bandeau b) {
        Random random = new Random();
        b.setMessage("On va changer de couleur");
        b.sleep(1000);
        b.setForeground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        b.sleep(1000);
    }
}
