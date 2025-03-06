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
        if(animals.size()< capacite) {
        animals.add(a);
        System.out.println("L'animal est ajouté dans l'enclos ");
        } else {
            System.out.println("l'enclos est plein .");
        }
    }
    public void retirerAnimal(Animal a) {
        animals.remove(a);
        System.out.println("L'animal a ete remis en liberte dans la nature");
    }
    public String getNom() {
        return nom;
    }

    public int getProprete() {
        return proprete;
    }

    public int getCapacite() {
        return capacite;
    }
    public void afficherLesAnimaux(){
        System.out.println(
                "Il y a "+animals.size()+ " animaux dans l'enlos :: ");
        for(Animal a : animals){
            System.out.println(a.toString());
        }
    }


    @Override
    public String toString() {
        return "L'enclos "+this.nom + " a "+ animals.size() + " d'animaux qui y habite "+'\n';
    }

    public void salir(){
        this.proprete= this.proprete - 1;
        System.out.println("Lenclos est devenu moins propres");
    }
    public void nettoyer(){
        this.proprete= 5;
        System.out.println("l'enclos est tout propre");
    }


}
