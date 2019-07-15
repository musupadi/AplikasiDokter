package com.destiny.aplikasidokter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.destiny.aplikasidokter.Adapter.AdapterDataTHT;
import com.destiny.aplikasidokter.Model.ModelData;
import com.destiny.aplikasidokter.Model.ModelTHT;
import com.destiny.aplikasidokter.R;

import java.util.ArrayList;

public class infopenyakit extends AppCompatActivity {

    Intent intent;
    RecyclerView ListView;
    private ArrayList<ModelTHT> List = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopenyakit);
        ListView = (RecyclerView) findViewById(R.id.listview);
        List.addAll(ModelData.getListData());
        ListView.setLayoutManager(new LinearLayoutManager(this));
        AdapterDataTHT adapter = new AdapterDataTHT(this);
        adapter.setListTHT(List);
        ListView.setAdapter(adapter);
    }
}
