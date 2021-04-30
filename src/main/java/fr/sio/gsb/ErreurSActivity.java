package fr.sio.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

public class ErreurSActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAccueil;
    Button buttonRetour;
    Button buttonDeconnexion;
    Button br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erreur_s);


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
                openActivitySaisie();
            }
        }));

        buttonAccueil = (Button) findViewById(R.id.buttonAccueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityAccueil();
            }
        });
        br = (Button) findViewById(R.id.button);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySaisie();
            }
        });
    }
    public void openActivityAccueil(){
        Intent accueil = new Intent(this, AccueilActivity.class);
        startActivity(accueil);
    }
    public void openActivitySaisie(){
        Intent sais = new Intent(this, Activity_saisie.class);
        startActivity(sais);
    }

    public void openActivityMain(){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }


    @Override
    public void onClick(View v) {

    }
}