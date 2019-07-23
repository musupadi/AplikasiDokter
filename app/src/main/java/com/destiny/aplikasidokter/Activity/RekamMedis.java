package com.destiny.aplikasidokter.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.destiny.aplikasidokter.Adapter.AdapterRekamMedis;
import com.destiny.aplikasidokter.R;
import com.destiny.aplikasidokter.SharedPreference.DB_Helper;
import com.destiny.aplikasidokter.SharedPreference.User;

import java.util.ArrayList;

public class RekamMedis extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<User> pList = new ArrayList<>();
    DB_Helper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekam_medis);

        rvCategory = (RecyclerView)findViewById(R.id.listview);

        rvCategory.setHasFixedSize(true);
        dbHelper = new DB_Helper(this);
        rvCategory.setLayoutManager(new LinearLayoutManager(RekamMedis.this));
        AdapterRekamMedis pahlawanAdapter = new AdapterRekamMedis(dbHelper.modelList(),RekamMedis.this,rvCategory);
        rvCategory.setAdapter(pahlawanAdapter);
    }
}
