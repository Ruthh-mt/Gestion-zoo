package zoo;
import zoo.personne.Personne;
import zoo.personne.Soigneur;
import zoo.personne.Visiteur;

import java.util.ArrayList;

public class Zoo {
    private String nom;
    private boolean debutJournee;
    private ArrayList<Visiteur>visiteur;
    private ArrayList <Soigneur> soigneurs;
    private ArrayList <Enclos> enclos;

    private double chiffreAffaire=0;

    public Zoo(String nom){
        this.nom=nom;
        this.debutJournee=true;
        this.visiteur=new ArrayList<>();
        this.soigneurs=new ArrayList<>();
        this.enclos=new ArrayList<>();

    }
    public void ajoutVisiteur(Visiteur v) {
        this.visiteur.add(v);
        chiffreAffaire+= v.getPrix();
        System.out.println(v.toString()+ " A bien été acceuilli ");
    }
    public void ajoutSoigneur(Soigneur s) {
        this.soigneurs.add(s);
        System.out.println(s.toString() + " A ete embauché ");
    }
    public void ajoutEnclos(Enclos e) {
        enclos.add(e);
    }
    public void afficherInfosZoo() {
        System.out.println("Bienvenue au " + nom + " !");
        System.out.println("Nombre total de visiteurs : " + visiteur.size());
        System.out.println("Revenu total : " + chiffreAffaire);
        System.out.println("\nEnclos :");
        for (Enclos enclos : enclos) {
            System.out.println(enclos.toString());
            System.out.println("  Animaux :");
            enclos.afficherLesAnimaux();
        }
    }













    public void supprimerVisiteur(Visiteur v) {
        this.visiteur.remove(v);
        System.out.println(v.toString()+ " A fini sa visite ");
    }
    public void supprimerSoigneur(Soigneur s) {
        this.soigneurs.remove(s);
        System.out.println(s.toString()+ " A ete licencié");
    }
    public void supprimerEnclos(Enclos e) {
        enclos.remove(e);
        System.out.println("Cette enclos a ete detruit :[ ");
    }

    public double getCA(){
        return chiffreAffaire;
    }





}
