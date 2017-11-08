package com.example.juan.enbuscadelitentperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String nombre;
    TextView bien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bien = (TextView)findViewById(R.id.textView);
        nombre = getIntent().getStringExtra("Nombre");

        bien.setText(String.format(getResources().getString(R.string.bienvenida),nombre));
    }
    public void corto (View v){
        Intent intent = new Intent(this,Main4Activity.class);
        intent.putExtra("Nombre", nombre);
        startActivity(intent);

    }

    public void largo (View v){
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);

    }
}
