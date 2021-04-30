package fr.sio.gsb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAccueil;
    Button buttonConnexion;
    Button buttonDeconnexion;
    EditText login;
    EditText psw;
    Button buttonInscription;
    DatabaseHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
        login = (EditText) findViewById(R.id.idUser);
        psw = (EditText) findViewById(R.id.password);
        buttonDeconnexion = (Button) findViewById(R.id.buttonDeconnexion);
        buttonDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });
        buttonConnexion = (Button) findViewById(R.id.buttonConnexionP);
        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = login.getText().toString();
                String motPasse = psw.getText().toString();
                Boolean validePass = db.nomPsw(nom,motPasse);
                if(validePass==true){
                    Toast.makeText(getApplicationContext(),"Connecté",Toast.LENGTH_SHORT).show();
                    openActivityAccueil();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Mot de passe ou non d'utilisateur incorrect",Toast.LENGTH_SHORT).show();
                }
              //  valider(login.getText().toString(), psw.getText().toString());
            }
        });
        buttonAccueil = (Button) findViewById(R.id.buttonAccueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityAccueil();
            }
        });
        buttonInscription = (Button) findViewById(R.id.buttonInscri);
        buttonInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openActivityInscription();

            }
        });
    }
    public void openActivityInscription() {
        Intent insp = new Intent(this, InscriptionActivity.class);
        startActivity(insp);
    }
    public void openActivityAccueil() {
        Intent accueil = new Intent(this, AccueilActivity.class);
        startActivity(accueil);
    }

    public void openActivityMain() {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

   /* private void valider(String userLogin, String userPsw) {
       // for (unVisiteur:lesVisiteurs) {
         //   if ((unVisiteur.getLogin.equals(userLogin) && unVisiteur.getMdp.equals(userPsw))) {

                 if((userLogin.equals("jean"))&&(userPsw.equals("aaa"))){
                Intent valid = new Intent(this, AccueilActivity.class);
                startActivity(valid);
            } else {
                String message = new String("Mot de passe ou Nom d'utilisateur incorrect");
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            }
        }*/
    //}
        @Override
        public void onClick (View v){

        }
    }
