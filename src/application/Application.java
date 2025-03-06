package application;

import zoo.*;
import zoo.animal.*;
import zoo.personne.Personne;
import zoo.personne.Soigneur;
import zoo.personne.Visiteur;

public class Application {
    public static void main(String[] args) {
        Zoo zoo=new Zoo("Jardin des Plantes");

        //creation de soigneur
        Personne soigneur1 = new Soigneur("Eve","Serpent");
        Personne soigneur2= new Soigneur("David","Lion");
        Personne soigneur3= new Soigneur("Paulette","Oiseau");
        zoo.ajoutSoigneur(soigneur1);
        zoo.ajoutSoigneur(soigneur2);
        zoo.ajoutSoigneur(soigneur3);
        //crreation de visiteur
        Personne visiteur1 = new Visiteur("Maite",25);
        Personne visiteur2= new Visiteur("Vincent",40);
        Personne visiteur3= new Visiteur("Juliette",4);
        Visiteur visiteur4 = new Visiteur("Alice", 12);
        zoo.ajoutVisiteur(visiteur1);
        zoo.ajoutVisiteur(visiteur2);
        zoo.ajoutVisiteur(visiteur3);
        zoo.ajoutVisiteur(visiteur4);
        //creation d'enclos
        Enclos enclosLions = new Enclos( 3,"Enclos des Lions");
        Enclos enclosOiseaux = new Enclos(5,"Volière");
        Enclos enclosSerpent= new Enclos(2,"Enclos des Serpent");
        zoo.ajoutEnclos(enclosLions);
        zoo.ajoutEnclos(enclosOiseaux);
        zoo.ajoutEnclos(enclosSerpent);
        //creation d'animaux
        Animal lion1 = new Lion("Simba", "Lion");
        Animal lion2 = new Lion("Nala", "Lion");
        Animal lion3 = new Lion("Grosminet", "Lion");
        Animal oiseau1 =new Oiseaux("Tweety", "Oiseau");
        Animal oiseau2 =new Oiseaux("Michelin", "Oiseau");
        Animal serpent1= new Serpent("Alonso", "Serpent");
        Animal serpent2= new Serpent("Victor", "Serpent");
        enclosOiseaux.ajouterAnimal(oiseau1);
        enclosOiseaux.ajouterAnimal(oiseau2);
        enclosSerpent.ajouterAnimal(serpent1);
        enclosSerpent.ajouterAnimal(serpent2);
        enclosLions.ajouterAnimal(lion1);
        enclosLions.ajouterAnimal(lion2);
        enclosLions.ajouterAnimal(lion3);
        // boucle while pour le programme

    }
}