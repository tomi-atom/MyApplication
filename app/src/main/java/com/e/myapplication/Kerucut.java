package com.e.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Kerucut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

    }

    public void selimutkerucut(View view) {
        Intent i = new Intent(Kerucut.this,Selimutkerucut.class);
        startActivity(i);

    }

    public void volumekerucut(View view) {

        Intent i = new Intent(Kerucut.this,Volumekerucut.class);
        startActivity(i);
    }

    public void backhome1(View view) {
        super.onBackPressed();
    }
}
