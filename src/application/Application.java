package application;

import zoo.*;
import zoo.Personne.Personne;
import zoo.Personne.Soigneur;
import zoo.Personne.Visiteur;

public class Application {
    public static void main(String[] args) {
        Zoo zoo=new Zoo("Jardin des Plantes","Paris");
        Personne soigneur1 = new Soigneur("Michelinne","Eve","Serpent");
        Personne soigneur2= new Soigneur("Goudenough","David","Lion");
        Personne soigneur3= new Soigneur("Popo","Paulette","Ouiseaux");
        Personne visiteur1 = new Visiteur("Castano","Maite",25);
        Personne visiteur2= new Visiteur("Macario","Vincent",40);
        Personne visiteur3= new Visiteur("Cho","Juliette",4);


    }
}