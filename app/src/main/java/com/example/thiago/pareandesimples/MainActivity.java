package com.example.thiago.pareandesimples;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean cor = false;
    private LinearLayout tela;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tela = (LinearLayout)findViewById(R.id.tela);
        texto = (TextView)findViewById(R.id.texto);
        Button brTrocar = (Button)findViewById(R.id.btTrocar);
        brTrocar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                chamarOutra();
            }
        });
    }

    private void chamarOutra() {
        if (cor = !cor) {
            tela.setBackgroundResource(R.color.verde);
            texto.setText(R.string.ande);
        } else {
            tela.setBackgroundResource(R.color.vermelho);
            texto.setText(R.string.pare);
        }
    }
}
