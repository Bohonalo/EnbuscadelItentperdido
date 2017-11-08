package com.example.juan.enbuscadelitentperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.etxNombre);
    }

    public void empezar (View v){


        if (et.getText().toString().equals("")){
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.toast), Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.BOTTOM, 0 , 0);

            toast1.show();
        }else{
            Intent intent = new Intent(this,Main2Activity.class);
            intent.putExtra("Nombre", et.getText().toString());
            startActivity(intent);
            finish();
        }
    }
}
