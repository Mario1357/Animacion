package com.example.mario.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

public void start(View view){
    ImageView aAvion = (ImageView)findViewById(R.id.uno);
    ImageView cCiudad = (ImageView)findViewById(R.id.ciudad);
    Button sStart = (Button)findViewById(R.id.inicio);
    Button tThen = (Button)findViewById(R.id. then);

    //la ciudad se hace visible
    cCiudad.animate().alpha(1f).setDuration(2000);

    //una avioneta se pone en el centro de la pantalla
    aAvion.animate().translationX(3000f).setDuration(3000);
    aAvion.setVisibility(view.VISIBLE);

    //boton start se hace invisible y se desactiva
    sStart.setEnabled(false);
    sStart.setVisibility(view.INVISIBLE);

    //boton then se hace visible y se activa
    tThen.setEnabled(true);
    tThen.setVisibility(view.VISIBLE);

}
    public void bomb(View view){

        ImageView aAvion = (ImageView)findViewById(R.id.uno);
        ImageView bBomba = (ImageView)findViewById(R.id.dos);
        ImageView cCiudad = (ImageView)findViewById(R.id.ciudad);
        ImageView eExplocion = (ImageView)findViewById(R.id.explocion);
        Button reinicar = (Button)findViewById(R.id.reinicio);
        Button tThen = (Button)findViewById(R.id. then);
        //se muestra la bomba y cae, al caer se hace invisible por la explocion
        bBomba.setVisibility(View.VISIBLE);
        bBomba.animate().translationY(500f).setDuration(1500);

        //el avion sale de la pantalla volando y se hace invisible
        aAvion.animate().translationX(2000f).setDuration(1000);
        aAvion.setVisibility(View.INVISIBLE);

        //se muestra la explocion
        eExplocion.setVisibility(View.VISIBLE);
        bBomba.setVisibility(View.INVISIBLE);

        //desaparece la ciudad por la explocion
        cCiudad.animate().alpha(0f).setDuration(100);

        //el boton then se hace invisible y se desactiva
        tThen.setEnabled(false);
        tThen.setVisibility(View.INVISIBLE);

        //el boton reiniciar se hace visible y se activa
        reinicar.setEnabled(true);
        reinicar.setVisibility(View.VISIBLE);
    }
    public void reinicio (View view){
        ImageView aAvion = (ImageView)findViewById(R.id.uno);
        ImageView bBomba = (ImageView)findViewById(R.id.dos);
        ImageView eExplocion = (ImageView)findViewById(R.id.explocion);
        Button reinicar = (Button)findViewById(R.id.reinicio);
        Button sStart = (Button)findViewById(R.id.inicio);

        //el avion regresa a su punto inicial
        aAvion.animate().translationX(-2000f).setDuration(100);

        //la explocion desaparece
        eExplocion.setVisibility(View.INVISIBLE);

        //la bomba regresa a su lugar de origen
        bBomba.animate().translationY(-500f).setDuration(100);

        //el boton de reinicio se hace invisible y se desactiva
        reinicar.setEnabled(false);
        reinicar.setVisibility(View.INVISIBLE);

        //el boton de start se hace visible y se activa
        sStart.setEnabled(true);
        sStart.setVisibility(View.VISIBLE);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //esconder la avioneta
        ImageView aAvion = (ImageView)findViewById(R.id.uno);
        aAvion.setTranslationX(-3000);
    }

}
