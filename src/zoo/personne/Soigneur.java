package zoo.personne;
import zoo.animal.*;

import java.util.Random;

public class Soigneur extends Personne {
    private String specialite;
    private boolean disponible;
    private boolean estMalade;

    public Soigneur(String prenom, String specialite) {
        super(prenom);
        this.specialite = specialite;
        this.disponible = true;
    }

    public void soigner (Animal animal) {
     if(animal.getEspece().equals(this.specialite)){
             System.out.println(super.getPrenom()+" a soigné "+ animal.getNom());
     } else{
         System.out.println(super.getPrenom()+ "ne peut pas soigner cet animal");
     }
    }
    public boolean diagnostic(Animal animal) {
        if(!animal.getEspece().equals(this.specialite)){

            Random random = new Random();
            this.estMalade = random.nextBoolean();

            if (estMalade) {
                System.out.println(animal.getNom() + " pourrait être malade.");
            } else {
                System.out.println(animal.getNom() + " semble en bonne santé.");
            }

        } else{
            System.out.println(super.getPrenom()+ "ne peut pas soigner cet animal");
        }
        return estMalade;
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
