package com.example.simplerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter {

    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView textview;
        public MyViewHolder(View v){
            super(v);
            textview = v.findViewById(R.id.tvFirstNameRow);
        }


    }
    public MyAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_row, parent, false);

        return new MyViewHolder(v);
    }

    public void onBindViewHolder(MyViewHolder holder, int position){
        holder.textview.setText(mDataset[position]);
    }
}
