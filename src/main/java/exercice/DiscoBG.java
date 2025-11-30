package exercice;

import java.awt.*;
import java.util.Random;

import bandeau.Bandeau;

public class DiscoBG extends Effet{
 
    public void excecuter(Bandeau bandeau) {
        Color back = bandeau.getBackground();
        Color front = bandeau.getForeground();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            bandeau.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            bandeau.setForeground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            bandeau.sleep(50);
        }
        bandeau.setBackground(back);
        bandeau.setForeground(front);
    }
}
