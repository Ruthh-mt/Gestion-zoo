package zoo.Personne;

public class Visiteur extends Personne {
    private int age;
    private int prix;
    public Visiteur(String nom, String prenom, int age) {
        super(nom, prenom);
        this.age = age;
    }
    public void payer(){

    }
    
    @Override
    public String toString() {
        return "Le visiteur "+super.toString();
    }
}
