package zoo.Personne;

import zoo.animal.Animal;

public class Soigneur extends Personne {
    private String specialite;
    private Animal animal;
    public Soigneur(String nom, String prenom, String adresse, String specialite, Animal animal) {
        super(nom, prenom);
        this.specialite = specialite;
        this.animal = animal;
    }
}
