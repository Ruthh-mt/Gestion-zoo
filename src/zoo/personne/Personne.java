package zoo.personne;

public class Personne {
    private String prenom;

    public Personne( String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return prenom+" ";
    }

    public String getPrenom() {
        return prenom;
    }
}
