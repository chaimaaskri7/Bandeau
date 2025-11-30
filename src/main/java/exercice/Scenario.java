package exercice;


import bandeau.Bandeau;
import java.util.ArrayList;

public class Scenario {

    private ArrayList<Effet> lesEffets;

    public Scenario() {
        this.lesEffets = new ArrayList<>();
    }

    public void ajouterEffet(Effet e, int nbreRept) {
        for (int i = 0; i < nbreRept; i++) {
            lesEffets.add(e);
        }
    }

    public void excecuter() {
        Bandeau b = new Bandeau();
        for (Effet e : lesEffets) {
                e.excecuter(b);
            }

        }
    }
