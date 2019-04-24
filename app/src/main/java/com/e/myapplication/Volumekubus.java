package com.e.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Volumekubus extends AppCompatActivity {

    EditText etKubus;
    Button button;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumekubus);

        etKubus = findViewById(R.id.etKubus);
        button = findViewById(R.id.button6);
        hasil = findViewById(R.id.hasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sisi = Double.parseDouble(etKubus.getText().toString());


                double volume = sisi * sisi * sisi;

                hasil.setText("Volume Kubus  "+String.valueOf(volume));

            }
        });


    }


    public void backVKubus(View view) {
        super.onBackPressed();
    }
}
