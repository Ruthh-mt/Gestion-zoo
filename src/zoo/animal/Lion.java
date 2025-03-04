package zoo.animal;

public abstract class Lion extends Animal {
    public Lion(String nom,boolean malade) {
        super(nom,malade);
    }
    public Lion(String name) {
        super(name);
        this.malade =false;
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
    public void malade() {
        this.malade = true;
        System.out.println("souffre ");
    }
    public void pasMalade(){
        this.malade = false;
        System.out.println("joyeux");
    }
    @Override
    public void faireUnTour() {
        System.out.println("*Monte sur ses pates arriere et tourne*");
    }

    @Override
    public String toString() {
        return "Le lion "+super.toString()+(this.malade?" Il est malade ":" Il est en bonne santé");
    }
}
