package fr.sio.gsb;

public class Practicien
{
    private int num;
    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;
    private int coefNotoriete;
    private String entourage;

    public Practicien(int num, String nom, String prenom, String adresse, String cp, String ville, int coefNotoriete, String entourage)
    {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.coefNotoriete = coefNotoriete;
        this.entourage = entourage;
    }


    public String
    getEntourage()
    {
        return entourage;
    }

    public void setEntourage(String entourage)
    {
        this.entourage = entourage;
    }

    public int getCoefNotoriete()
    {
        return coefNotoriete;
    }

    public void setCoefNotoriete(int coefNotoriete)
    {
        this.coefNotoriete = coefNotoriete;
    }

    public String getVille()
    {
        return ville;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    public String getCp()
    {
        return cp;
    }

    public void setCp(String cp)
    {
        this.cp = cp;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
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

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }
}
