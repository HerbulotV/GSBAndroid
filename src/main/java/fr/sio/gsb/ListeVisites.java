package fr.sio.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionService;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListeVisites extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvVisite;
    TextView tvSelection;

    Button retour;


    //  Visite[] lesVisites = {};
    private String[] visite = {"Visite n°1", "Visite n°2", "Visite n°3", "Visite n°4", "Visite n°5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_visites);
        tvSelection = (TextView) findViewById(R.id.idTvSelection);
        lvVisite = (ListView) findViewById(R.id.idLvisite);
        ArrayAdapter<String> adaptateur = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                visite
        );
        lvVisite.setAdapter(adaptateur);
        lvVisite.setOnItemClickListener((AdapterView.OnItemClickListener) this);

      /*  ArrayAdapter adapter = new ArrayAdapter<Visite>(this,R.layout.activity_liste_visites,lesVisites);

        ListView listView = (ListView)findViewById(R.id.laListe);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
                Intent abc = new Intent();
            //    abc.setClass(this,AffichageCompeRendu.class);
                abc.putExtra("position", position);
                startActivity(abc);
            }
        });

    }


    @Override
    public void onClick(View v) {

    }
*/
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String visiteSelectionee = visite[position];
        tvSelection.setText("Visite sélectionée : " + visiteSelectionee + " id : " + id);
    }
}