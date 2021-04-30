package fr.sio.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConsulterActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAccueil;
    Button buttonRetour;
    Button buttonDeconnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulter);


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
                openActivityAccueil();
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