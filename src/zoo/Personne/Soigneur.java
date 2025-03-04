package zoo.Personne;
import zoo.animal.*;
import zoo.*;
import java.util.Random;

public class Soigneur extends Personne {
    private String specialite;
    private boolean disponible;
    private Animal animal;

    public Soigneur(String nom, String prenom, String specialite) {
        super(nom, prenom);
        this.specialite = specialite;
        this.disponible = true;
    }
    public Soigneur(String nom, String prenom, String specialite, Animal animal) {
        super(nom, prenom);
        this.specialite = specialite;
        this.disponible = true;
        this.animal=animal;
    }

    public void diagnostic(Animal animal) {
        int random = new Random().nextInt(2);
        if (random == 0) {
            animal.pasMalade();
        }
        else{
            animal.malade();
        }
    }

    public void rendreDisponible() {
        this.disponible = true;

    }
    public void rendreIndisponible() {
        this.disponible = false;

    }
    public boolean estDisponible() {
        return this.disponible;

    }
}
