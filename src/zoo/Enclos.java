package zoo;

import zoo.animal.Animal;

public class Enclos {
    private Animal animal;
    private int proprete;
    private int capacite;
    private String nom;
    public Enclos(Animal animal, int proprete, int capacite, String nom) {
        this.animal = animal;
        this.proprete = proprete;
        this.capacite = capacite;
        this.nom = nom;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Enclos{" +
                "animal=" + animal +
                ", proprete=" + proprete +
                ", capacite=" + capacite +
                ", nom='" + nom + '\'' +
                '}';
    }
}
