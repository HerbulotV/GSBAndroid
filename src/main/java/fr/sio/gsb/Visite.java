package fr.sio.gsb;
import java.util.Date;

public class Visite
{
    private int id;
    private int idPrac;
    private int dateVisite;
    private int dateRapport;
    private String motif;
    private String bilan;
    private int idConf;

    public Visite(int id, int idPrac, int dateVisite, int dateRapport, String motif, String bilan, int idConf)
    {
        this.id = id;
        this.idPrac = idPrac;
        this.dateVisite = dateVisite;
        this.dateRapport = dateRapport;
        this.motif = motif;
        this.bilan = bilan;
        this.idConf = idConf;
    }

    public String confString()
    {
        int val = this.getIdConf();
        String res = "Pas d'id connu";
        switch (val){
            case 1:
                res = "convaincu";
                break;
            case 2:
                res = "hésitant";
                break;
            case 3:
                res = "non convaincu";
                break;
        }
        return res;
    }

    public int getIdConf() {
        return idConf;
    }

    public void setIdConf(int idConf)
    {
        this.idConf = idConf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPrac() {
        return idPrac;
    }

    public void setIdPrac(int idPrac) {
        this.idPrac = idPrac;
    }

    public int getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(int dateVisite) {
        this.dateVisite = dateVisite;
    }

    public int getDateRapport() {
        return dateRapport;
    }

    public void setDateRapport(int dateRapport) {
        this.dateRapport = dateRapport;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getBilan() {
        return bilan;
    }

    public void setBilan(String bilan) {
        this.bilan = bilan;
    }
}

