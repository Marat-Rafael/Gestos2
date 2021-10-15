package com.example.gestos2;

import androidx.core.view.MotionEventCompat;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View myView = findViewById(R.id.textView);
        myView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                // ... Respond to touch events
                int action = MotionEventCompat.getActionMasked(event);
                TextView textoResultado;
                switch (action) {
                    case (MotionEvent.ACTION_DOWN):
                        textoResultado = (TextView) findViewById(R.id.textView);
                        textoResultado.setText("Boton esta pulsado");
                        return true;
                    case (MotionEvent.ACTION_UP):
                        textoResultado = (TextView) findViewById(R.id.textView);
                        textoResultado.setText("Boton esta levantado");
                        return true;
                    case (MotionEvent.ACTION_MOVE):
                        textoResultado = (TextView) findViewById(R.id.textView);
                        textoResultado.setText("hay un movimiento");
                        return true;
                    case (MotionEvent.ACTION_CANCEL):
                        textoResultado = (TextView) findViewById(R.id.textView);
                        textoResultado.setText("Accion Cancelada");
                        return true;
                    case (MotionEvent.ACTION_OUTSIDE):
                        textoResultado = (TextView) findViewById(R.id.textView);
                        textoResultado.setText("Hay una accion fuera de area");
                        return true;
                }
                return true;
            }
        });
    }


}