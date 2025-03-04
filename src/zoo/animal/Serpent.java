package zoo.animal;

public abstract class Serpent extends Animal {
    public Serpent(String nom,boolean malade) {
        super(nom,malade);
    }
    public Serpent(String name) {
        super(name);
        this.malade =false;
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

    public void malade() {
        this.malade = true;
    }
    public void pasMalade(){
        this.malade = false;
    }
    @Override
    public void faireUnTour() {
        System.out.println("*Fait un coeur sur le sol*");
        System.out.println("*Etouffe un soigneur*");
    }

    public String toString() {
        return "Le serpent "+super.toString()+(this.malade?" Il est malade ":" Il est en bonne santé");
    }


}
