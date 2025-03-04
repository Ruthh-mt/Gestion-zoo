package zoo.animal;

public abstract class Oiseaux extends Animal {
    public Oiseaux(String nom,boolean malade) {
        super(nom,malade);
    }
    public Oiseaux(String name) {
        super(name);
        this.malade =false;
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
    public void malade() {
        this.malade = true;
    }
    public void pasMalade(){
        this.malade = false;
    }

    @Override
    public void faireUnTour() {
        System.out.println("*Fait un looping dans les air*");
    }

    @Override
    public String toString() {
        return "L'oiseau "+ super.toString()+ (this.malade?" Il est malade ":" Il est en bonne santé");
    }
}
