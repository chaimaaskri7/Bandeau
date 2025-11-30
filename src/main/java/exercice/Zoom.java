package exercice;
import java.awt.*;

import bandeau.Bandeau;

public class Zoom extends Effet {
     public void excecuter(Bandeau b) {
        b.setMessage("On va zoomer");
        b.sleep(1000);
        b.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            b.sleep(100);
        }
        b.sleep(1000);

    }
}
