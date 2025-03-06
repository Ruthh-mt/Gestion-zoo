package zoo.animal;

public abstract class Serpent extends Animal {
    public Serpent(String nom,String espece) {
        super(nom,espece);
    }
    public void manger(String nourriture) {
        System.out.println("Gobe "+ nourriture);
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
        return "Le "+super.toString()+(this.malade?" Il est malade ":" Il est en bonne santé");
    }


}
