package zoo.animal;

public abstract class Serpent extends Animal {
    public Serpent(String nom) {
        super(nom);
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


}
