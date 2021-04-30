package fr.sio.gsb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccueilActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAccueil;
    Button buttonRetour;
    Button buttonDeconnexion;
    Button buttonSCR;
    Button buttonCCR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        //Button

        buttonCCR = (Button) findViewById(R.id.buttonCCR);
        buttonCCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCCR();
            }
        });

        buttonSCR = (Button) findViewById(R.id.buttonSCR);
        buttonSCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySCR();
            }
        });

        buttonDeconnexion = (Button) findViewById(R.id.buttonDeconnexion);
        buttonDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });

        buttonRetour = (Button) findViewById(R.id.buttonRetour);
        buttonRetour.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        }));

        buttonAccueil = (Button) findViewById(R.id.buttonAccueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityAccueil();
            }
        });
    }
        public void openActivityCCR(){
            Intent consulterCR= new Intent(this, ListeVisites.class);
            startActivity(consulterCR);

        }
        public void openActivitySCR(){
            Intent saisieCR= new Intent(this, Activity_saisie.class);
            startActivity(saisieCR);
        }
        public void openActivityAccueil(){
            Intent accueil = new Intent(this, AccueilActivity.class);
            startActivity(accueil);
        }

        public void openActivityMain(){
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        }


    @Override
    public void onClick(View v) {

    }
}


