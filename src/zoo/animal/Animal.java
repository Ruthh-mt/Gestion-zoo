package zoo.animal;

public abstract class Animal {
    private String name;
    protected boolean malade;
    public Animal(String name, boolean malade) {
        this.name = name;
        this.malade =malade;
    }
    public Animal(String name) {
        this.name = name;
        this.malade =false;
    }

    public abstract void manger(String nourriture);
    public abstract void seDeplacer();
    public abstract void faireBruit();
    public abstract void malade();
    public abstract void pasMalade();
    public abstract void faireUnTour();

    @Override
    public String toString() {
        return "de nom "+this.name+" ";
    }

}
