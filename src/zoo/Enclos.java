package zoo;

import zoo.animal.Animal;

import java.util.ArrayList;

public class Enclos {
    private int proprete;
    private int capacite;
    private String nom;
    private ArrayList<Animal> animals;
    public Enclos( int capacite, String nom) {
        this.proprete = 5;
        this.capacite = capacite;
        this.nom = nom;
    }
    public void ajouterAnimal(Animal a) {
        animals.add(a);
        System.out.println("L'animal est ajouté dans l'enclos ");
    }
    public void retirerAnimal(Animal a) {
        animals.remove(a);
        System.out.println("L'animal a ete remis en liberte dans la nature");
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getProprete() {
        return proprete;
    }

    public void setProprete(int proprete) {
        this.proprete = proprete;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "L'enclos "+this.nom + " a "+ animals.size() + " d'animaux qui y habite "+'\n';
    }

    public int rendreSale(){
        this.proprete= this.proprete - 1;
        return this.proprete;
    }
    public int RendrePropres(){
        this.proprete= this.proprete + 1;
        return this.proprete;
    }

}
