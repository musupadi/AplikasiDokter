package com.destiny.aplikasidokter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.destiny.aplikasidokter.R;

public class DetailActivity extends AppCompatActivity {
    TextView definisi,gejala,sebab,pencegahan,pengobatan;
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        definisi=(TextView)findViewById(R.id.tvDevinisi);
        gejala=(TextView)findViewById(R.id.tvGejala);
        sebab=(TextView)findViewById(R.id.tvSebab);
        pencegahan=(TextView)findViewById(R.id.tvPencegahan);
        pengobatan=(TextView)findViewById(R.id.tvPengobatan);
        gambar=(ImageView)findViewById(R.id.ivImage);

        Intent data = getIntent();
        String Gambar = data.getStringExtra("GAMBAR");
        String Definisi = data.getStringExtra("DEFINISI");
        String Gejala = data.getStringExtra("GEJALA");
        String Penyebab = data.getStringExtra("PENYEBAB");
        String Pencegahan = data.getStringExtra("PENCEGAHAN");
        String Pengobatan = data.getStringExtra("PENGOBATAN");
        gambar.setImageResource(Integer.parseInt(Gambar));
        definisi.setText(Definisi);
        gejala.setText(Gejala);
        sebab.setText(Penyebab);
        pencegahan.setText(Pencegahan);
        pengobatan.setText(Pengobatan);

    }
}
