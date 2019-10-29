package com.example.actividades;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String msn = this.getIntent().getExtras().getString("msn");
        TextView txt = findViewById(R.id.txt);
        txt.setText(msn);
    }

    protected void onStart() {
        super.onStart();
        Toast toast1 = Toast.makeText(getApplicationContext(),"Onstart", Toast.LENGTH_SHORT);
        toast1.show();
    }
    protected void onResume(){
        super.onResume();
        Toast toast2 = Toast.makeText(getApplicationContext(),"OnResume", Toast.LENGTH_SHORT);
        toast2.show();
    }
    protected void onPause(){
        super.onPause();
        Toast toast3 = Toast.makeText(getApplicationContext(),"OnPause", Toast.LENGTH_SHORT);
        toast3.show();
    }
    protected void onStop(){
        super.onStop();
        Toast toast4 = Toast.makeText(getApplicationContext(),"Onstop", Toast.LENGTH_SHORT);
        toast4.show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast toast5 = Toast.makeText(getApplicationContext(),"OnRestart", Toast.LENGTH_SHORT);
        toast5.show();
    }
    protected void onDestroy(){
        super.onDestroy();
    }

}
