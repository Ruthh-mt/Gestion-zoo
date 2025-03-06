package zoo.animal;

public abstract class Lion extends Animal {

    public Lion(String nom, String espece) {
        super(nom,espece);
    }
    public void manger(String nourriture) {
        System.out.println("Mange "+ nourriture);
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
        return "Le " + super.toString()+(this.malade?" Il est malade ":" Il est en bonne santé");
    }
}
