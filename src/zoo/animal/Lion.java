package zoo.animal;

public abstract class Lion extends Animal {
    public Lion(String nom) {
        super(nom);
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
}
