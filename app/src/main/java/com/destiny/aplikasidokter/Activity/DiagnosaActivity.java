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
                    goInput.putExtra("LIST", "Apakah Anda sakit kepala?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if(Medis.equals("G2")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G3");
                    goInput.putExtra("GEJALA","Gejala Ke-3");
                    goInput.putExtra("LIST","Apakah Anda mengalami nyeri saat bicara atau menelan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G3")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G7");
                    goInput.putExtra("GEJALA","Gejala Ke-7");
                    goInput.putExtra("LIST","Apakah Anda merasa nyeri tenggorokan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G7")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G39");
                    goInput.putExtra("GEJALA","Gejala Ke-39");
                    goInput.putExtra("LIST","Apakah Anda mengalami selaput lendir merah?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G39")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G10");
                    goInput.putExtra("GEJALA","Gejala Ke-10");
                    goInput.putExtra("LIST","Apakah Anda mengalami mual dan muntah?");
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
                    goInput.putExtra("LIST", "Apakah Anda mengalami hidung tersumbat?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if(Medis.equals("G5")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G13");
                    goInput.putExtra("GEJALA","Gejala Ke-13");
                    goInput.putExtra("LIST","Apakah leher Anda terasa nyeri?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});}
                else if(Medis.equals("G13")){
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS","G8");
                    goInput.putExtra("GEJALA","Gejala Ke-8");
                    goInput.putExtra("LIST","Apakah Anda mengalami hidung meler?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});}
                else if(Medis.equals("G8")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G9");
                    goInput.putExtra("GEJALA", "Gejala Ke-9");
                    goInput.putExtra("LIST", "Apakah Anda mengalami letih dan lesu?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G9")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G11");
                    goInput.putExtra("GEJALA", "Gejala Ke-11");
                    goInput.putExtra("LIST", "Apakah Anda merasa tidak enak badan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if(Medis.equals("G11")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G12");
                    goInput.putExtra("GEJALA", "Gejala Ke-12");
                    goInput.putExtra("LIST", "Apakah ada benjolan dileher?");
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
                    goInput.putExtra("LIST", "Apakah anda mengalami nyeri antara mata?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                } else if (Medis.equals("G26")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G27");
                    goInput.putExtra("GEJALA", "Gejala Ke-27");
                    goInput.putExtra("LIST", "Apakah mengalami nyeri di pinggir hidung?");
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
                    goInput.putExtra("LIST", "Apakah mengalami pembengkakan kelenjar getah bening?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G14")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G16");
                    goInput.putExtra("GEJALA", "Gejala Ke-16");
                    goInput.putExtra("LIST", "Apakah suara Anda serak?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G16")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G22");
                    goInput.putExtra("GEJALA", "G22");
                    goInput.putExtra("LIST", "Apakah mengalami air liur menetes?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                } else if(Medis.equals("G22")){
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR",String.valueOf(R.drawable.p2));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G3a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G7b");
                    goInput.putExtra("GEJALA", "Gejala Ke-7");
                    goInput.putExtra("LIST", "Apakah Anda merasa nyeri tenggorokan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }else if (Medis.equals("G7b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G13a");
                    goInput.putExtra("GEJALA", "Gejala Ke-13");
                    goInput.putExtra("LIST", "Apakah leher Anda terasa nyeri?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }else if (Medis.equals("G13a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G14a");
                    goInput.putExtra("GEJALA", "Gejala Ke-14");
                    goInput.putExtra("LIST", "Apakah mengalami pembengkakan kelenjar getah bening?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }else if (Medis.equals("G14a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p16));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});}

                else if (Medis.equals("G14b")) {
                Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                goInput.putExtra("MEDIS", "G19");
                goInput.putExtra("GEJALA", "Gejala Ke-19");
                goInput.putExtra("LIST", "Apakah Anda mengalami leher bengkak?");
                DiagnosaActivity.this.startActivities(new Intent[]{goInput});

        }
                else if (Medis.equals("G19")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G37");
                    goInput.putExtra("GEJALA", "Gejala Ke-37");
                    goInput.putExtra("LIST", "Apakah Anda mengalami tenggorokan gatal?");
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
                    goInput.putExtra("LIST", "Apakah Anda mengalami nyeri telinga?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G6")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G15");
                    goInput.putExtra("GEJALA", "Gejala Ke-15");
                    goInput.putExtra("LIST", "Apakah terjadi pendarahan pada hidung Anda?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G15")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G25");
                    goInput.putExtra("GEJALA", "Gejala Ke-25");
                    goInput.putExtra("LIST", "Apakah Anda mengalami infeksi sinus?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G25")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G29");
                    goInput.putExtra("GEJALA", "Gejala Ke-29");
                    goInput.putExtra("LIST", "Apakah Anda mengalami nyeri wajah?");
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
                    goInput.putExtra("GEJALA", "Gejala Ke-10");
                    goInput.putExtra("LIST", "Apakah Anda mengalami mual dan muntah?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G10a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G32");
                    goInput.putExtra("GEJALA", "Gejala Ke-32");
                    goInput.putExtra("LIST", "Apakah Anda mengalami radang gendang telinga?");
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
                    goInput.putExtra("GEJALA", "Gejala Ke-6");
                    goInput.putExtra("LIST", "Apakah Anda mengalami nyeri telinga?");
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
                    goInput.putExtra("LIST", "Apakah Anda merasa ketidak seimbangan pada tubuh?");
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
                    goInput.putExtra("GEJALA", "Gejala Ke-4");
                    goInput.putExtra("LIST", "Apakah Anda mengalami batuk?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G4a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G7c");
                    goInput.putExtra("GEJALA", "Gejala Ke-7");
                    goInput.putExtra("LIST", "Apakah Anda merasa nyeri tenggorokan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G7c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G13b");
                    goInput.putExtra("GEJALA", "Gejala Ke-13");
                    goInput.putExtra("LIST", "Apakah leher Anda terasa nyeri?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G13b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G16a");
                    goInput.putExtra("GEJALA", "Gejala Ke-16");
                    goInput.putExtra("LIST", "Apakah suara Anda serak?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if (Medis.equals("G16a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G23");
                    goInput.putExtra("GEJALA", "Gejala Ke-23");
                    goInput.putExtra("LIST", "Apakah berat badan Anda turun?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if (Medis.equals("G23")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G24");
                    goInput.putExtra("GEJALA", "Gejala Ke-24");
                    goInput.putExtra("LIST", "Apakah bunyi nafas Anda terasa berbeda (abnormal)?");
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
                    goInput.putExtra("GEJALA", "Gejala Ke-15");
                    goInput.putExtra("LIST", "Apakah terjadi pendarahan pada hidung Anda?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G15a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G21");
                    goInput.putExtra("GEJALA", "Gejala Ke-21");
                    goInput.putExtra("LIST", "Apakah ada yang tumbuh di mulut Anda?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G21")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G30");
                    goInput.putExtra("GEJALA", "Gejala Ke-30");
                    goInput.putExtra("LIST", "Apakah terjadi perubahan pada kulit Anda?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G30")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G31");
                    goInput.putExtra("GEJALA", "Gejala Ke-31");
                    goInput.putExtra("LIST", "Apakah terjadi perubahan pada suara Anda?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G31")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p10));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G16b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p4));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G19a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p1));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G5b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G15b");
                    goInput.putExtra("GEJALA", "Gejala Ke-15");
                    goInput.putExtra("LIST", "Apakah terjadi pendarahan pada hidung Anda?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G15b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p9));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G6c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G10b");
                    goInput.putExtra("GEJALA", "Gejala Ke-10");
                    goInput.putExtra("LIST", "Apakah Anda mengalami mual dan muntah?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G10b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G34");
                    goInput.putExtra("GEJALA", "Gejala Ke-34");
                    goInput.putExtra("LIST", "Apakah Anda mengalami serangan vertigo?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if (Medis.equals("G34")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G36");
                    goInput.putExtra("GEJALA", "Gejala Ke-36");
                    goInput.putExtra("LIST", "Apakah telinga Anda terasa penuh?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G36")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p13));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G7d")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G12b");
                    goInput.putExtra("GEJALA", "Gejala Ke-12");
                    goInput.putExtra("LIST", "Apakah ada benjolan dileher?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G12b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p11));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G10c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G17a");
                    goInput.putExtra("GEJALA", "Gejala Ke-17");
                    goInput.putExtra("LIST", "Apakah bola mata Anda bergerak tanpa sadar?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("17a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p14));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("12c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p8));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("17b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, HasilDiagnosaActivity.class);
                    goInput.putExtra("GAMBAR", String.valueOf(R.drawable.p23));
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }

                else if (Medis.equals("G20a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G35");
                    goInput.putExtra("GEJALA", "Gejala Ke-35");
                    goInput.putExtra("LIST", "Apakah telinga Anda berdenging?");
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
                    goInput.putExtra("LIST", "Apakah Anda mengalami batuk?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }
                else if (Medis.equals("G5")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G8");
                    goInput.putExtra("GEJALA", "Gejala Ke-8");
                    goInput.putExtra("LIST", "Apakah Anda mengalami hidung meler?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G11")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G17");
                    goInput.putExtra("GEJALA", "Gejala Ke-17");
                    goInput.putExtra("LIST", "Apakah bola mata Anda bergerak tanpa sadar?");
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
                    goInput.putExtra("GEJALA", "Gejala Ke-7");
                    goInput.putExtra("LIST", "Apakah Anda merasa nyeri tenggorokan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }else if (Medis.equals("G2")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G3a");
                    goInput.putExtra("GEJALA", "Gejala Ke-3");
                    goInput.putExtra("LIST", "Apakah Anda mengalami nyeri saat bicara atau menelan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});

                }
                else if (Medis.equals("G7b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G14b");
                    goInput.putExtra("GEJALA", "Gejala Ke-14");
                    goInput.putExtra("LIST", "Apakah mengalami pembengkakan kelenjar getah bening?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G3a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G5a");
                    goInput.putExtra("GEJALA", "Gejala Ke-5");
                    goInput.putExtra("LIST", "Apakah Anda mengalami hidung tersumbat?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G5a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G6a");
                    goInput.putExtra("GEJALA", "Gejala Ke-6");
                    goInput.putExtra("LIST", "Apakah Anda mengalami nyeri telinga?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G1")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G2a");
                    goInput.putExtra("GEJALA", "Gejala Ke-2");
                    goInput.putExtra("LIST", "Apakah Anda sakit kepala?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G6b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G20");
                    goInput.putExtra("GEJALA", "Gejala Ke-20");
                    goInput.putExtra("LIST", "Apakah Anda tidak bisa mendengar (tuli)?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G2a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G3b");
                    goInput.putExtra("GEJALA", "Gejala Ke-3");
                    goInput.putExtra("LIST", "Apakah Anda mengalami nyeri saat bicara atau menelan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G4a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G12a");
                    goInput.putExtra("GEJALA", "Gejala Ke-12");
                    goInput.putExtra("LIST", "Apakah ada benjolan dileher?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G12a")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G16b");
                    goInput.putExtra("GEJALA", "Gejala Ke-16");
                    goInput.putExtra("LIST", "Apakah suara Anda serak?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G16b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G19a");
                    goInput.putExtra("GEJALA", "Gejala Ke-19");
                    goInput.putExtra("LIST", "Apakah Anda mengalami leher bengkak?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G3b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G5b");
                    goInput.putExtra("GEJALA", "Gejala Ke-5");
                    goInput.putExtra("LIST", "Apakah Anda mengalami hidung tersumbat?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G5b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G6c");
                    goInput.putExtra("GEJALA", "Gejala Ke-6");
                    goInput.putExtra("LIST", "Apakah Anda mengalami nyeri telinga?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G6c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G7d");
                    goInput.putExtra("GEJALA", "Gejala Ke-7");
                    goInput.putExtra("LIST", "Apakah Anda merasa nyeri tenggorokan?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G7d")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G10c");
                    goInput.putExtra("GEJALA", "Gejala Ke-10");
                    goInput.putExtra("LIST", "Apakah Anda mengalami mual dan muntah?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G10c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G12c");
                    goInput.putExtra("GEJALA", "Gejala Ke-12");
                    goInput.putExtra("LIST", "Apakah ada benjolan dileher?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G12c")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G17b");
                    goInput.putExtra("GEJALA", "Gejala Ke-17b");
                    goInput.putExtra("LIST", "Apakah bola mata Anda bergerak tanpa sadar?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
                else if (Medis.equals("G17b")) {
                    Intent goInput = new Intent(DiagnosaActivity.this, DiagnosaActivity.class);
                    goInput.putExtra("MEDIS", "G20a");
                    goInput.putExtra("GEJALA", "Gejala Ke-20");
                    goInput.putExtra("LIST", "Apakah Anda tidak bisa mendengar (tuli) ?");
                    DiagnosaActivity.this.startActivities(new Intent[]{goInput});
                }
            }});
    }}



