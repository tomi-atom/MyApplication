package com.e.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Kubus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
    }

    public void volume(View view) {
        Intent i = new Intent(Kubus.this,Volumekubus.class);
        startActivity(i);
    }

    public void selimut(View view) {
        Intent i = new Intent(Kubus.this,Selimutkubus.class);
        startActivity(i);
    }

    public void backhome(View view) {
        super.onBackPressed();
    }
}
