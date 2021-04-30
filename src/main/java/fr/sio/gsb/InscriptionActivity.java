package fr.sio.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InscriptionActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText e1, e2,e3;
    Button b1,retour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        db = new DatabaseHelper(this);
        e1 = (EditText) findViewById(R.id.NomUserIns);
        e2 = (EditText) findViewById(R.id.pasw);
        e3 = (EditText) findViewById(R.id.repasw);
        retour =(Button) findViewById(R.id.retourBut);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });

        b1= (Button) findViewById(R.id.buttonValidIn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if (s1.equals("")||s2.equals("")||s3.equals("")){
                    Toast.makeText(getApplicationContext(), "Champs non remplis", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (s2.equals(s3)){
                        Boolean nomValide = db.NomValide(s1);
                        if(nomValide==true){
                            Boolean insert = db.insert(s1,s2);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Inscription réussi !",Toast.LENGTH_SHORT).show();
                            }

                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Nom d'utilisateur déja utilisé", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{Toast.makeText(getApplicationContext(),"Mot de passe incorrect",Toast.LENGTH_SHORT).show();}
                }
            }
        });
    }
    public void openActivityMain(){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

}