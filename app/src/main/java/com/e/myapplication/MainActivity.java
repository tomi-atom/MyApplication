package com.e.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kubus(View view) {
        Intent i = new Intent(MainActivity.this,Kubus.class);
        startActivity(i);
    }

    public void kerucut(View view) {
        Intent i = new Intent(MainActivity.this,Kerucut.class);
        startActivity(i);
    }

    public void balok(View view) {
        Intent i = new Intent(MainActivity.this,Balok.class);
        startActivity(i);
    }

    public void exit(View view) {
        moveTaskToBack(true);
    }
}
