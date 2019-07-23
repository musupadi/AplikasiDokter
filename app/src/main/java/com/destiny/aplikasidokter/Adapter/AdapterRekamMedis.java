package com.destiny.aplikasidokter.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.aplikasidokter.Activity.DetailActivity;
import com.destiny.aplikasidokter.Model.ModelTHT;
import com.destiny.aplikasidokter.R;
import com.destiny.aplikasidokter.SharedPreference.DB_Helper;
import com.destiny.aplikasidokter.SharedPreference.User;

import java.util.ArrayList;
import java.util.List;

public class AdapterRekamMedis extends RecyclerView.Adapter<AdapterRekamMedis.ViewHolder> {
    private List<User> mMusicList;
    private Context mContext;
    private RecyclerView mRecyclerV;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView Nama,Umur;
        public ImageView Gambar;

        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            Nama=(TextView)v.findViewById(R.id.tvNama);
            Umur=(TextView)v.findViewById(R.id.tvUmur);
            Gambar=(ImageView)v.findViewById(R.id.ivImage);
        }
    }

    public void add(int position, User models) {
        mMusicList.add(position, models);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        mMusicList.remove(position);
        notifyItemRemoved(position);
    }



    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterRekamMedis(List<User> myDataset, Context context, RecyclerView recyclerView) {
        mMusicList = myDataset;
        mContext = context;
        mRecyclerV = recyclerView;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AdapterRekamMedis.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.list_rekam_data, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final User models = mMusicList.get(position);
        holder.Nama.setText(models.getNama());
        holder.Umur.setText(models.getUmur());
        holder.Gambar.setImageResource(Integer.parseInt(models.getGambar()));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mMusicList.size();
    }

}
