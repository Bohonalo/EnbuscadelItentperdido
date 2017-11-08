package com.example.juan.enbuscadelitentperdido;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    String nombre;
    TextView correcto;
    boolean llave = false;
    int valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        correcto = (TextView) findViewById(R.id.textView2);
        nombre = getIntent().getStringExtra("Nombre");

        correcto.setText(String.format(getResources().getString(R.string.main4), nombre));
    }

    public void puerta(View v) {

        if (llave == true){
            Intent intent = new Intent(this, Main6Activity.class);
            startActivityForResult(intent, valor);
        }else{
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.toast2), Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.BOTTOM, 0 , 0);

            toast1.show();
        }

    }

    public void llave(View v) {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivityForResult(intent, valor);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == valor
                && resultCode == RESULT_OK) {
            llave = true;

            Toast toast1 = Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.ya), Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.BOTTOM, 0 , 0);

            toast1.show();

        }else{
            llave = false;

            Toast toast1 = Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.aun), Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.BOTTOM, 0 , 0);

            toast1.show();
        }

    }
}
