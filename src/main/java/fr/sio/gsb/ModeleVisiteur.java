package fr.sio.gsb;
import java.util.List;
import java.util.ArrayList;
public class ModeleVisiteur {
    private ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();

    public ModeleVisiteur(){
        super();
        this.peupler();
    }
    public List<Visiteur>getLesVisiteurs(){
        return this.lesVisiteurs;
    }

    public void peupler(){
        this.lesVisiteurs.add(new Visiteur (1, "Ara","valentin", "Stark", "Aria"));
    this.lesVisiteurs.add(new Visiteur(1,"uber", "eat", "Jean", "Castex"));
        this.lesVisiteurs.add(new Visiteur(2,"Mac", "Do", "Catherine", "Souspont"));
        this.lesVisiteurs.add(new Visiteur(3,"Deli", "veroo", "Marc", "Gon"));
        this.lesVisiteurs.add(new Visiteur(2, "herbulot","vhgf", "Saefi", "Aaefa"));
    }
    public Visiteur connexion(String login, String mdp){
        for(Visiteur unVisiteur : lesVisiteurs){
            if(login.equals(unVisiteur.getLogin())){
                if(mdp.equals(unVisiteur.getMdp())){
                    return unVisiteur;
                }
            }
        }
        return null;
    }
}