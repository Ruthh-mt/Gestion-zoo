package zoo.animal;

public class Lion extends Animal {

    public Lion(String nom, String espece) {
        super(nom,espece);
    }
    public void manger() {
        System.out.println("*Mange de la viande*");
    }

    public void seDeplacer() {
        System.out.println("*Marche*");
    }

    @Override
    public void faireBruit() {
        System.out.println("ROARRRR!");
    }

    @Override
    public void faireUnTour() {
        System.out.println("*Monte sur ses pates arriere et tourne*");
    }

    @Override
    public String toString() {
        return "Le " + super.toString();
    }
}
