package com.e.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Selimutkubus extends AppCompatActivity {

    EditText etKubus;
    Button button;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selimutkubus);
        etKubus = findViewById(R.id.etKubus);
        button = findViewById(R.id.button7);
        hasil = findViewById(R.id.hasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =  etKubus.getText().toString();
                double sisi = Double.parseDouble(s);

                double volume = 6 * sisi * sisi;

                hasil.setText("Selimut Kubus "+String.valueOf(volume));

            }
        });


    }
}
