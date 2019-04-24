package com.e.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Selimutbalok extends AppCompatActivity {

    EditText etPanjang,etLebar,etTinggi;
    Button btnHitung,btnBack;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selimutbalok);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);

        btnHitung = findViewById(R.id.btnHitung);
        btnBack = findViewById(R.id.btnBack);
        hasil = findViewById(R.id.hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double p = Double.parseDouble(etPanjang.getText().toString());
                double l = Double.parseDouble(etLebar.getText().toString());
                double t = Double.parseDouble(etTinggi.getText().toString());

                double volume = (p + l + t) * 2;

                hasil.setText("Selimut Balok  "+String.valueOf(volume));


            }
        });

    }

    public void backSbalok(View view) {
        super.onBackPressed();
    }
}
