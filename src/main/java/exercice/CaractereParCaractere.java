package exercice;

import bandeau.Bandeau;
import java.awt.*;

public class CaractereParCaractere extends Effet {

    public void excecuter(Bandeau b) {
        String[] message = {"h", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d"};
        for (int i = 0; i <= message.length; i++) {
            b.sleep(500);
            b.setMessage(message[i]);
            b.setForeground(Color.RED);
        }

    }

}
