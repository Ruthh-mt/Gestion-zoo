package application;
import java.util.Scanner;
import zoo.*;
import zoo.animal.*;
import zoo.personne.*;

public class Application {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Zoo zoo=new Zoo("Jardin des Plantes");

        //creation de soigneur
        Soigneur soigneur1 = new Soigneur("Eve","Serpent");
        Soigneur soigneur2= new Soigneur("David","Lion");
        Soigneur soigneur3= new Soigneur("Paulette","Oiseau");
        zoo.ajoutSoigneur(soigneur1);
        zoo.ajoutSoigneur(soigneur2);
        zoo.ajoutSoigneur(soigneur3);
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
        while(true){
            System.out.println("Bienvenue dans le systeme de gestion du zoo");
            System.out.println("Que souhaitez-vous faire ?");
            System.out.println("1. Afficher les informations du zoo");
            System.out.println("2. Ajouter un visiteur");
            System.out.println("3. Embocher un soigneur ");
            System.out.println("4. Construire un enclos");
            System.out.println("5. Faire un spectacle");
            System.out.println("6. Supprimer");
            System.out.println("7. Finir la journée");
            System.out.println("8. Quitter");
            int choix = clavier.nextInt();

            switch(choix){
                case 1:
                    zoo.afficherInfosZoo();
                    break;
                    case 2:
                        System.out.println("Veuillez entrer les infos du visiteur");
                        String nom=clavier.nextLine();
                        int age =clavier.nextInt();
                        clavier.nextLine();
                        Visiteur newVisiteur = new Visiteur(nom,age);
                        zoo.ajoutVisiteur(newVisiteur);
                        System.out.println( nom+ "est entré dans le zoo");
                        break;
                        case 3:

            }

        }

    }
}