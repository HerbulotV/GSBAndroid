package fr.sio.gsb;

import android.widget.Toast;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TestUnit {
    private Visiteur g1;
    private Visiteur b2;
    private ModeleVisiteur mo;
    @Before
    public void setUp() throws Exception{
        g1 = new Visiteur (1, "Ara","valentin", "Stark", "Aria");
        mo = new ModeleVisiteur();
        b2 = new Visiteur(2, "herbulot","vhgf", "Saefi", "Aaefa");
    }
    @Test
    public void testConnexion(){
        assertNotNull("connexion error",mo.connexion("Ara", "valentin"));
        assertNull("visiteur perdu",mo.connexion("herbulotfb","vhgf"));
    }

}
