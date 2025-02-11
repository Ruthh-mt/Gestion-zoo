package zoo.Personne;

public class Visiteur extends Personne {
    private int age;
    public Visiteur(String nom, String prenom, int age) {
        super(nom, prenom);
        this.age = age;
    }
}
