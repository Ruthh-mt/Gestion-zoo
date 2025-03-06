package zoo.personne;

import zoo.animal.*;

public class Visiteur extends Personne {
    private int age;
    private int prix;
    public Visiteur(String prenom, int age) {
        super(prenom);
        this.age = age;
    }

    public void observerAnimal(Animal animal) {
        System.out.println(super.getPrenom() + " *observe* " + animal.getNom());
        animal.faireBruit();
        System.out.println("WOAWW!!!");
    }
    public double getPrix() {
        return age <16 ? 5.0 : 10.0;
    }
    
    @Override
    public String toString() {
        return "Le visiteur "+super.toString();
    }

    public int getAge() {
        return age;
    }
}
