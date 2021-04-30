package fr.sio.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class AffichageCompeRendu extends AppCompatActivity implements View.OnClickListener{
    TextView lePrac;
    TextView dateVisite;
    TextView dateRapport;
    TextView motif;
    TextView bilan;
    TextView idConf;
    Visite laVisite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_compe_rendu);
      Visite LaVisite = new Visite(1, 2, 04/04/2019, 04/04/2019, "Excellent", "Paltaniaiser", 4 );
        lePrac = (TextView) findViewById(R.id.lePrac);
        lePrac.setText("laVisite.getLePracticien()");

        dateVisite = (TextView) findViewById(R.id.dateVisite);
        dateVisite.setText("laVisite.get");
        dateRapport = (TextView) findViewById(R.id.dateRapport);

        motif = (TextView) findViewById(R.id.lePrac);

        bilan = (TextView) findViewById(R.id.bilan);

        idConf = (TextView) findViewById(R.id.idConf);
    }





    @Override
    public void onClick(View v) {

    }
}

