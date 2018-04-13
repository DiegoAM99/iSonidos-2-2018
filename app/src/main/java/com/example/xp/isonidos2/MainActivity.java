package com.example.xp.isonidos2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //selecciono el main layout
        LinearLayout principal = findViewById(R.id.botones);

        //creamos un boton por codigo y lo añadimos a la pantalla principal
        Button b=new Button(this);
        b.setText("cancion1");
        b.setTextColor(Color.WHITE);
        b.setBackgroundColor(Color.BLUE);
        b.setAllCaps(false); //todas las letras del boton en minúscula
        b.getTag(1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b2 = (Button)  findViewById(view.getId());
                sonido(b2.getTag().toString());
            }
        });
        b.setTag("1");

        //añadimos el boton al layout
        principal.addView(b);
    }

    public void sonido(){
    Log.i("etiqueta: ", _etiqueta);
    }
}
