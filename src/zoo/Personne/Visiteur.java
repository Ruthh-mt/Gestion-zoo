package zoo.Personne;

import zoo.animal.*;

public class Visiteur extends Personne {
    private int age;
    private int prix;
    private boolean paye;
    public Visiteur(String nom, String prenom, int age) {
        super(nom, prenom);
        this.age = age;
        this.paye=false;
    }
    public void payer(){

    }
    public void observerAnimal(Animal animal) {
        System.out.println(super.getPrenom() + " *observe* " + animal.getNom());
        animal.faireBruit();
        System.out.println("WOAWW!!!");
    }
    public void payer(double montant) {
        this.paye = true;
        System.out.println(super.getPrenom() + " a payé " + montant + "€ pour entrer au zoo.");
    }
    
    @Override
    public String toString() {
        return "Le visiteur "+super.toString();
    }

    public int getAge() {
        return age;
    }
}
