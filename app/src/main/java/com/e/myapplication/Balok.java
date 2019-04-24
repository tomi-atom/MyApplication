package com.e.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Balok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
    }


    public void volumebalok(View view) {
        Intent i = new Intent(Balok.this,Volumebalok.class);
        startActivity(i);
    }

    public void selimutbalok(View view) {
        Intent i = new Intent(Balok.this,Selimutbalok.class);
        startActivity(i);
    }

    public void backhome2(View view) {
        super.onBackPressed();

    }
}
