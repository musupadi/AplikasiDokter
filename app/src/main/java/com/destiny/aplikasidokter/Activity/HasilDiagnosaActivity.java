package com.destiny.aplikasidokter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.destiny.aplikasidokter.Model.ModelData;
import com.destiny.aplikasidokter.Model.ModelTHT;
import com.destiny.aplikasidokter.R;

import java.util.ArrayList;

public class HasilDiagnosaActivity extends AppCompatActivity {

    ImageView ivGambar;
    TextView diagnosa;
    Button check,simpan;
    private ArrayList<ModelTHT> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_diagnosa);
        ivGambar=(ImageView)findViewById(R.id.ivGejala);
        diagnosa=(TextView)findViewById(R.id.tvDiagnosa);
        check=(Button)findViewById(R.id.btnCheck);
        simpan=(Button)findViewById(R.id.btnSimpan);
        Intent data = getIntent();
        final String Gambar = data.getStringExtra("GAMBAR");
        String Diagnosa = data.getStringExtra("DIAGNOSA");
        diagnosa.setText(Diagnosa);
        ivGambar.setImageResource(Integer.parseInt(Gambar));
        pList.addAll(ModelData.getListData());

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i <=pList.size()-1;i++){
                    if(pList.get(i).getPhoto().equals(Gambar)){
                        Intent goInput = new Intent(HasilDiagnosaActivity.this, DetailActivity.class);
                        goInput.putExtra("GAMBAR",pList.get(i).getPhoto());
                        goInput.putExtra("DEFINISI",pList.get(i).getDefinisi());
                        goInput.putExtra("GEJALA",pList.get(i).getGejala());
                        goInput.putExtra("PENYEBAB",pList.get(i).getPenyebab());
                        goInput.putExtra("PENCEGAHAN",pList.get(i).getPencegahan());
                        goInput.putExtra("PENGOBATAN",pList.get(i).getPengobatan());
                        HasilDiagnosaActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });

    }
}