package zoo;
import java.util.ArrayList;
import zoo.animal.*;
import zoo.personne.*;
public class Spectacle {
private String nom;
private Soigneur soigneurPartcipants;
private ArrayList<Animal> animauxSpectacle;

public Spectacle(String nom, Soigneur soigneurPartcipants) {
    this.nom = nom;
    this.soigneurPartcipants = soigneurPartcipants;
    this.animauxSpectacle = new ArrayList<>();
}
public void ajouterAnimal(Animal animal){
    if(animauxSpectacle.contains(animal)){
        System.out.println("L'animal est deja inscrit au spectacle");
    } else {
        animauxSpectacle.add(animal);
    }
}
public void retirerAnimal(Animal animal){
    animauxSpectacle.remove(animal);
}
public void Spectacle(ArrayList<Visiteur>visiteurs) {
    System.out.println("Le spectacle " + nom + " est entrain de commencer");
    System.out.println("Presenter par :" + soigneurPartcipants.getPrenom());
    for (Animal animal : animauxSpectacle) {
        System.out.println("C'est au tour de : " + animal.getNom() + " (" + animal.getEspece() + ")");
        animal.faireBruit();
        animal.faireUnTour();
        for (Visiteur spectateur : visiteurs) {
            spectateur.observerAnimal(animal);
        }
    }
    System.out.println("Fin du spectacle");
}

}
