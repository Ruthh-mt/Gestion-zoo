package zoo;

import zoo.Personne.Soigneur;
import zoo.Personne.Visiteur;
import zoo.*;

import java.util.ArrayList;

public class Zoo {
    private String nom;
    private String ville;
    private boolean debutJournee;
    private ArrayList<Visiteur>visiteur;
    private ArrayList <Soigneur> soigneurs;
    private int chiffreAffaire=0;

    public Zoo(String nom, String ville){
        this.nom=nom;
        this.ville=ville;
        this.debutJournee=true;
        this.visiteur=new ArrayList<>();
        this.soigneurs=new ArrayList<>();

    }
    public void AjoutVisiteur(Visiteur v) {
        this.visiteur.add(v);
        System.out.println(v.toString()+ " A bien été ajouté ");
    }
    public void AjoutSoigneur(Soigneur s) {
        this.soigneurs.add(s);
        System.out.println(s.toString() + " A ete embauché ");
    }














    public void supprimerVisiteur(Visiteur v) {
        this.visiteur.remove(v);
        System.out.println(v.toString()+ " A fini sa visite ");
    }
    public void supprimerSoigneur(Soigneur s) {
        this.soigneurs.remove(s);
        System.out.println(s.toString()+ " A ete licencié");
    }





}
