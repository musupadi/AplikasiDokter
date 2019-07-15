package com.destiny.aplikasidokter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.destiny.aplikasidokter.R;

public class HasilDiagnosaActivity extends AppCompatActivity {

    ImageView ivGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_diagnosa);
        ivGambar=(ImageView)findViewById(R.id.ivGejala);
        Intent data = getIntent();
        String Gambar = data.getStringExtra("GAMBAR");
        ivGambar.setImageResource(Integer.parseInt(Gambar));
    }
}
