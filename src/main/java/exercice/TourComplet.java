package exercice;

import bandeau.Bandeau;
import java.awt.*;

public class TourComplet extends Effet {

    public void excecuter(Bandeau b) {

        b.setMessage("Rotation");
        for (int i = 0; i <= 13; i++) {
            b.sleep(300);
            b.setRotation(i);
            b.setFont(new Font("SansSerif", Font.PLAIN, 20));
        }

    }
}
