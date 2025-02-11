package zoo.animal;

public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public abstract void manger(String nourriture);
    public abstract void seDeplacer();
    public abstract void faireBruit();

}
