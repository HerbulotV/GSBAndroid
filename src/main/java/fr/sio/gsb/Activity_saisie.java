package fr.sio.gsb;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Activity_saisie extends AppCompatActivity implements  View.OnClickListener, AdapterView.OnItemSelectedListener {
    Button buttonAccueil;
    Button buttonRetour;
    Button buttonDeconnexion;
    Spinner spinnerPracti;
    Spinner spinnerIndice;
    Spinner spinnerMotif;
    Button save;

    private static  final String TAG = "Activity_saisie";
    private TextView myDisplayDate;
    private DatePickerDialog.OnDateSetListener maDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);
            save = (Button) findViewById(R.id.buttonSave);
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityErreur();
                }
            });

            myDisplayDate = (TextView) findViewById(R.id.dateSelect);
            myDisplayDate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Calendar cal = Calendar.getInstance();
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH);
                    int day = cal.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog dialog = new DatePickerDialog(
                            Activity_saisie.this,
                            android.R.style.Theme_Holo_Dialog_MinWidth,
                            maDateSetListener,
                            year, month, day);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.show();
                }
            });

            maDateSetListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int day) {
                    month = month + 1;
                    Log.d(TAG,"oneDateSet: dd/mm/yyy:"+day+"/"+ month+"/"+year);

                    String date = day+"/"+ month+"/"+year;
                    myDisplayDate.setText(date);
                }
            };
            //spinner
            spinnerPracti = (Spinner) findViewById(R.id.spinnerPracti);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinnerPracti, android.R.layout.simple_spinner_item );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerPracti.setAdapter(adapter);
            spinnerPracti.setOnItemSelectedListener(this);


        spinnerMotif= (Spinner) findViewById(R.id.spinnerMotif);
        String[] listeMotifs = new String[]{"Remontage", "Périodicité", "Sémarcharge"};
        ArrayAdapter<String> listMotifsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, listeMotifs);
        spinnerMotif.setAdapter(listMotifsAdapter);


        spinnerIndice= (Spinner) findViewById(R.id.spinnerIndice);
        String[] listeIndices = new String[]{"1: Excellent", "2: Bon", "3: Mauvais"};
        ArrayAdapter<String> listIndiceAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, listeIndices);
        spinnerIndice.setAdapter(listIndiceAdapter);



            //Button
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
        public void openActivityErreur(){
        Intent err= new Intent(this, ErreurSActivity.class);
        startActivity(err);
        }

        public void openActivityMain(){
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        }



    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
