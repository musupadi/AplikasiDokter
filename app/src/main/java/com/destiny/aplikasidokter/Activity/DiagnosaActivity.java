package com.destiny.aplikasidokter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destiny.aplikasidokter.Model.DataModel;
import com.destiny.aplikasidokter.Model.ModelDiagnosa;
import com.destiny.aplikasidokter.R;

import java.util.ArrayList;

public class DiagnosaActivity extends AppCompatActivity {
    TextView gejala,pertanyaan;
    Button ya,tidak;
    private ArrayList<DataModel> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        gejala=(TextView)findViewById(R.id.tvGejala);
        pertanyaan=(TextView)findViewById(R.id.tvPertanyaan);
        ya=(Button)findViewById(R.id.btnYa);
        tidak=(Button)findViewById(R.id.btnTidak);

        Intent data = getIntent();
        final String Medis = data.getStringExtra("MEDIS");
        String Gejala = data.getStringExtra("GEJALA");
        String Pertanyaan = data.getStringExtra("LIST");
        pList.addAll(ModelDiagnosa.getListData());
        gejala.setText(Gejala);
        pertanyaan.setText(Pertanyaan);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Medis.equals("G1")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G2");
                    goInput.putExtra("GEJALA", "Gejala Ke-2");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if(Medis.equals("G2")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G3");
                    goInput.putExtra("GEJALA","Gejala Ke-3");
                    goInput.putExtra("LIST","Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G3")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G7");
                    goInput.putExtra("GEJALA","Gejala Ke-7");
                    goInput.putExtra("LIST","Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G7")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G39");
                    goInput.putExtra("GEJALA","Gejala Ke-39");
                    goInput.putExtra("LIST","Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G39")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G10");
                    goInput.putExtra("GEJALA","Gejala Ke-10");
                    goInput.putExtra("LIST","Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G10")){
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR",String.valueOf(R.drawable.p22));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G4")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G5");
                    goInput.putExtra("GEJALA", "Gejala Ke-5");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G5")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G13");
                    goInput.putExtra("GEJALA","Gejala Ke-13");
                    goInput.putExtra("LIST","Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});}
                else if(Medis.equals("G13")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G8");
                    goInput.putExtra("GEJALA","Gejala Ke-8");
                    goInput.putExtra("LIST","Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});}
                else if(Medis.equals("G8")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G9");
                    goInput.putExtra("GEJALA", "Gejala Ke-9");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G9")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G11");
                    goInput.putExtra("GEJALA", "Gejala Ke-11");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G11")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G12");
                    goInput.putExtra("GEJALA", "Gejala Ke-12");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G12")){
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR",String.valueOf(R.drawable.p20));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G17")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G26");
                    goInput.putExtra("GEJALA", "Gejala Ke-26");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                } else if (Medis.equals("G26")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G27");
                    goInput.putExtra("GEJALA", "Gejala Ke-27");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

            else if(Medis.equals("G27")){
                Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                goInput.putExtra("GAMBAR",String.valueOf(R.drawable.p18));
                DiagnosaActivity.this.startActivities(new Intent[]{goInput});
            }else if (Medis.equals("G7a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G14");
                    goInput.putExtra("GEJALA", "Gejala Ke-14");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G14")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G16");
                    goInput.putExtra("GEJALA", "Gejala Ke-16");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G16")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G22");
                    goInput.putExtra("GEJALA", "G22");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                } else if(Medis.equals("G22")){
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR",String.valueOf(R.drawable.p2));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G3a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G7b");
                    goInput.putExtra("GEJALA", "Gejala Ke-7b");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }else if (Medis.equals("G7b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G13a");
                    goInput.putExtra("GEJALA", "Gejala Ke-13a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }else if (Medis.equals("G13a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G14a");
                    goInput.putExtra("GEJALA", "Gejala Ke-14a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }else if (Medis.equals("G14a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p16));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});}

                else if (Medis.equals("G14b")) {
                Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                goInput.putExtra("MEDIS", "G19");
                goInput.putExtra("GEJALA", "Gejala Ke-19");
                goInput.putExtra("LIST", "Data Pertanyaan");
                DiagnosaActivity.this.startActivities(new Intent[]{goInput});

        }
                else if (Medis.equals("G19")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G37");
                    goInput.putExtra("GEJALA", "Gejala Ke-37");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }
                else if(Medis.equals("G37")){
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR",String.valueOf(R.drawable.p12));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G5a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G6");
                    goInput.putExtra("GEJALA", "Gejala Ke-6");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G6")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G15");
                    goInput.putExtra("GEJALA", "Gejala Ke-15");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G15")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G25");
                    goInput.putExtra("GEJALA", "Gejala Ke-25");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G25")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G29");
                    goInput.putExtra("GEJALA", "Gejala Ke-29");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G37")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p5));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G6a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G10a");
                    goInput.putExtra("GEJALA", "Gejala Ke-10a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G10a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G32");
                    goInput.putExtra("GEJALA", "Gejala Ke-32");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G32")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p15));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G2a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G6b");
                    goInput.putExtra("GEJALA", "Gejala Ke-6b");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G6b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p3));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G20")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G38");
                    goInput.putExtra("GEJALA", "Gejala Ke-38");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G38")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p21));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G3b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G4a");
                    goInput.putExtra("GEJALA", "Gejala Ke-4a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G4a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G7c");
                    goInput.putExtra("GEJALA", "Gejala Ke-7c");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G7c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G13b");
                    goInput.putExtra("GEJALA", "Gejala Ke-13b");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if (Medis.equals("G16a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G23");
                    goInput.putExtra("GEJALA", "Gejala Ke-23");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if (Medis.equals("G23")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G24");
                    goInput.putExtra("GEJALA", "Gejala Ke-24");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G24")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p7));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G12a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G15a");
                    goInput.putExtra("GEJALA", "Gejala Ke-15a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G12a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G15a");
                    goInput.putExtra("GEJALA", "Gejala Ke-15a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

         }});
        tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Medis.equals("G39")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p17));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G7")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G4");
                    goInput.putExtra("GEJALA", "Gejala Ke-4");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }
                else if (Medis.equals("G5")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G8");
                    goInput.putExtra("GEJALA", "Gejala Ke-8");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G11")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G17");
                    goInput.putExtra("GEJALA", "Gejala Ke-17");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G26")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p19));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G4")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G7a");
                    goInput.putExtra("GEJALA", "Gejala Ke-7a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G2")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G3a");
                    goInput.putExtra("GEJALA", "Gejala Ke-3a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }
                else if (Medis.equals("G7b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G14b");
                    goInput.putExtra("GEJALA", "Gejala Ke-14b");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G3a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G5a");
                    goInput.putExtra("GEJALA", "Gejala Ke-5a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G5a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G6a");
                    goInput.putExtra("GEJALA", "Gejala Ke-6a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G1")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G2a");
                    goInput.putExtra("GEJALA", "Gejala Ke-2a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G6b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G20");
                    goInput.putExtra("GEJALA", "Gejala Ke-20");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G2a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G3b");
                    goInput.putExtra("GEJALA", "Gejala Ke-3b");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G4a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G12a");
                    goInput.putExtra("GEJALA", "Gejala Ke-12a");
                    goInput.putExtra("LIST", "Data Pertanyaan");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }


            }});
    }}



