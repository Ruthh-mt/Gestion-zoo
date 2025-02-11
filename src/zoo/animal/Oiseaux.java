package zoo.animal;

public abstract class Oiseaux extends Animal {
    public Oiseaux(String nom) {
        super(nom);
    }

    public void manger(String nourriture) {
        System.out.println("Picore "+ nourriture);
    }

    public void seDeplacer() {
        System.out.println("*Vole*");
    }

    @Override
    public void faireBruit() {
        System.out.println("CUI CUI CUI!");
    }

    @Override
    public String toString() {
        return "L'oiseau "+super.toString();
    }
}
