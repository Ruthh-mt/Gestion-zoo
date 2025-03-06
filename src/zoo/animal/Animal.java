package zoo.animal;

public abstract class Animal {
    private String nom;
    private String espece;
    protected boolean malade;

    public Animal(String nom, String espece) {
        this.nom = nom;
        this.malade = false;
        this.espece = espece;
    }

    public abstract void manger();

    public abstract void seDeplacer();

    public abstract void faireBruit();

    public abstract void faireUnTour();

    @Override
    public String toString() {
        return this.espece + " de nom " + this.nom + " ";
    }

    public String getEspece() {
        return espece;
    }

    public String getNom() {
        return nom;
    }
}
