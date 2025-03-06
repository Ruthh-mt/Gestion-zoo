package zoo.Personne;
import zoo.animal.*;
import zoo.*;

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

    public void soigner (Animal animal) {
     if(animal.getEspece().equals(this.specialite)){
         if(animal.estMalade()){
             System.out.println(super.getPrenom()+" a soigné "+ animal.getNom());
         } else{
             System.out.println(animal.getNom() +" n'est pas malade");
         }
     } else{
         System.out.println(super.getPrenom()+ "ne peut pas soigner cet animal");
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
