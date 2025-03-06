package zoo.animal;

public class Serpent extends Animal {
    public Serpent(String nom,String espece) {
        super(nom,espece);
    }
    public void manger() {
        System.out.println("*mange un rats*");
    }

    public void seDeplacer() {
        System.out.println("*Rampe*");
    }

    @Override
    public void faireBruit() {
        System.out.println("SSSSSSSSS !");
    }

    @Override
    public void faireUnTour() {
        System.out.println("*Fait un coeur sur le sol*");
        System.out.println("*Etouffe un soigneur*");
    }

    public String toString() {
        return "Le "+super.toString();
    }


}
