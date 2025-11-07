package com.example.simplerecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter {

    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView textview;
        public MyViewHolder(View v){
            super(v);

        }
    }
}
