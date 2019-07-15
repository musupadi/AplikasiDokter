package com.destiny.aplikasidokter.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.destiny.aplikasidokter.Activity.DetailActivity;
import com.destiny.aplikasidokter.Activity.DiagnosaActivity;
import com.destiny.aplikasidokter.Model.ModelTHT;

import java.util.ArrayList;

import com.destiny.aplikasidokter.R;

public class AdapterDataTHT extends RecyclerView.Adapter<AdapterDataTHT.CategoryViewHolder> {
        private Context context;
        private ArrayList<ModelTHT> listTHT;

        private ArrayList<ModelTHT> getListTHT() {
            return listTHT;
        }

        public void setListTHT(ArrayList<ModelTHT> listTHT) {
            this.listTHT = listTHT;
        }

        public AdapterDataTHT(Context context) {
            this.context = context;
        }

        @NonNull
        @Override
        public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);
            return new CategoryViewHolder(itemRow);
        }

        @Override
        public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
            categoryViewHolder.Gambar.setImageResource(Integer.parseInt(getListTHT().get(position).getPhoto()));
            categoryViewHolder.Gambar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent goInput = new Intent(context, DetailActivity.class);
                    goInput.putExtra("GAMBAR",getListTHT().get(position).getPhoto());
                    goInput.putExtra("DEFINISI",getListTHT().get(position).getDefinisi());
                    goInput.putExtra("GEJALA",getListTHT().get(position).getGejala());
                    goInput.putExtra("PENYEBAB",getListTHT().get(position).getPenyebab());
                    goInput.putExtra("PENCEGAHAN",getListTHT().get(position).getPencegahan());
                    goInput.putExtra("PENGOBATAN",getListTHT().get(position).getPengobatan());
                    context.startActivities(new Intent[]{goInput});
                }
            });
        }

        @Override
        public int getItemCount() {
            return getListTHT().size();
        }

        class CategoryViewHolder extends RecyclerView.ViewHolder {
            ImageView Gambar;


            CategoryViewHolder(@NonNull View itemView) {
                super(itemView);

                Gambar=(ImageView)itemView.findViewById(R.id.logoitem);

            }
        }
    }
