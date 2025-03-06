package zoo;

import zoo.Personne.Soigneur;
import zoo.Personne.Visiteur;
import zoo.*;
import java.util.Random;
import java.util.ArrayList;

public class Zoo {
    private String nom;
    private String ville;
    private boolean debutJournee;
    private ArrayList<Visiteur>visiteur;
    private ArrayList <Soigneur> soigneurs;
    private ArrayList <Enclos> enclos;

    private int chiffreAffaire=0;

    public Zoo(String nom, String ville){
        this.nom=nom;
        this.ville=ville;
        this.debutJournee=true;
        this.visiteur=new ArrayList<>();
        this.soigneurs=new ArrayList<>();
        this.enclos=new ArrayList<>();

    }
    public void ajoutVisiteur(Visiteur v) {
        this.visiteur.add(v);
        v.payer(v.getAge() < 16 ? 5.0 : 10.0);
        System.out.println(v.toString()+ " A bien été acceuilli ");
    }
    public void ajoutSoigneur(Soigneur s) {
        this.soigneurs.add(s);
        System.out.println(s.toString() + " A ete embauché ");
    }
    public void ajoutEnclos(Enclos e) {
        enclos.add(e);
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





}
