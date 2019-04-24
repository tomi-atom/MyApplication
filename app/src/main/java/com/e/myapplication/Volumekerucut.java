package com.e.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Volumekerucut extends AppCompatActivity {

    EditText jari,tinggi;
    Button btnHitung,btnBack;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumekerucut);


        jari = findViewById(R.id.etjari);
        tinggi = findViewById(R.id.etTinggi);

        btnHitung = findViewById(R.id.btnHitung);
        btnBack = findViewById(R.id.btnBack);

        hasil = findViewById(R.id.hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double j = Double.parseDouble(jari.getText().toString());
                double t = Double.parseDouble(tinggi.getText().toString());

                double s = Math.sqrt( Math.pow(j,2) + Math.pow(t,2) );

                double volume = 1/3 * 3.14 * j*j* t;
                hasil.setText("Volume Kerucut  "+String.valueOf(volume));
            }
        });


    }

    public void backvKrucut(View view) {
        super.onBackPressed();
    }
}
