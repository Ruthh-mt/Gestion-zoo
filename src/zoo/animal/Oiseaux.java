package zoo.animal;

public abstract class Oiseaux extends Animal {
    public Oiseaux(String nom,String espece) {
        super(nom,espece);
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
    public void faireUnTour() {
        System.out.println("*Fait un looping dans les air*");
    }

    @Override
    public String toString() {
        return "L' "+ super.toString()+ (this.malade?" Il est malade ":" Il est en bonne santé");
    }
}
