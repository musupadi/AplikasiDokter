package com.destiny.aplikasidokter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destiny.aplikasidokter.R;

public class MainActivity extends AppCompatActivity {
    Button diagnosa;
    Button info;
    Button rekam;
    Button peta;
    Button tentang;
    Button profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diagnosa = (Button) findViewById(R.id.btnDiagnosa);
        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(MainActivity.this, DiagnosaActivity.class);
                goInput.putExtra("MEDIS", "G1");
                goInput.putExtra("GEJALA", "Gejala Pertama");
                goInput.putExtra("LIST", "Apakah Anda Demam ?");
                MainActivity.this.startActivities(new Intent[]{goInput});
            }
        });

        info = (Button) findViewById(R.id.btnInfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(MainActivity.this, infopenyakit.class);
                goInput.putExtra("MEDIS", "0");
                MainActivity.this.startActivities(new Intent[]{goInput});
            }
        });

        rekam = (Button) findViewById(R.id.btnRekamMedis);
        rekam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(MainActivity.this, RekamMedis.class);
                goInput.putExtra("MEDIS", "0");
                MainActivity.this.startActivities(new Intent[]{goInput});
            }
        });

        peta = (Button) findViewById(R.id.btnPeta);
        peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(MainActivity.this, MapsActivity.class);
                goInput.putExtra("MEDIS", "0");
                MainActivity.this.startActivities(new Intent[]{goInput});
            }
        });

        tentang = (Button) findViewById(R.id.btnAbout);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(MainActivity.this, Tentang.class);
                goInput.putExtra("MEDIS", "0");
                MainActivity.this.startActivities(new Intent[]{goInput});
            }
        });

        profil = (Button) findViewById(R.id.btnDeveloper);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(MainActivity.this, Profile.class);
                goInput.putExtra("MEDIS", "0");
                MainActivity.this.startActivities(new Intent[]{goInput});
            }
        });

    }
}
