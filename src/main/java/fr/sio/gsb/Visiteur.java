    package fr.sio.gsb;

public class Visiteur
{
    private int id;
    private String login;
    private String mdp;
    private String nom;
    private String prenom;

    public Visiteur(int id, String login, String mdp, String nom, String prenom)
    {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Visiteur(String login, String mdp){
        this.login = login;
        this.mdp= mdp;
    }


    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getMdp()
    {
        return mdp;
    }

    public void setMdp(String mdp)
    {
        this.mdp = mdp;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
