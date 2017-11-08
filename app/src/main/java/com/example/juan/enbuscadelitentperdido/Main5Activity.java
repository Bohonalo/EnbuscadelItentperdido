package com.example.juan.enbuscadelitentperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    int llave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

    }

    public void conLlave (View v){
        setResult(RESULT_OK);
        finish();
    }

    public void sinLlave (View v){
        setResult(RESULT_CANCELED);
        finish();
    }
}
