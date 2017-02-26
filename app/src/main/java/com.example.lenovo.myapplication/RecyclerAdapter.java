package com.example.lenovo.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;

/**
 * Created by Lenovo on 26-02-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] names, statuses;

    public RecyclerViewAdapter(String[] names, String[] statuses) {
        this.names = names;
        this.statuses = statuses;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txt_name = setText(names[position]);
        holder.txt_status = setText(statuses[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView txt_name, txt_status;
        public RecyclerViewHolder(View view) {
            super(view);
            txt_name = (TextView) view.findViewById(R.id.txt_name);
            txt_status = (TextView) view.findViewById(R.id.txt_status);
        }
    }
}
