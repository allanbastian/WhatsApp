package com.example.lenovo.whatsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private LayoutInflater inflater;
    List<Item> data= Collections.emptyList();
    public RecyclerAdapter(Context context, List<Item> data){
        inflater=LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.row_layout, parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item current=data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconid);
        holder.descripts.setText(current.descript);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView icon;
        TextView descripts;

        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.listText);
            icon= (ImageView) itemView.findViewById(R.id.listIcon);
            descripts= (TextView) itemView.findViewById(R.id.des);
        }
    }
}
