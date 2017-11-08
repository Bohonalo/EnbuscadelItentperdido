package com.example.juan.enbuscadelitentperdido;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void llamarAtencion(View v){
        Uri telf = Uri.parse("tel:917407272");
        Intent llamada = new Intent(Intent.ACTION_DIAL, telf);
        if (llamada.resolveActivity(getPackageManager()) != null) {
            startActivity(llamada);
        }

    }

}
