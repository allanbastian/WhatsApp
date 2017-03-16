package com.example.lenovo.whatsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CallsFrag extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.calls_frag, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.list3);
        adapter = new RecyclerAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    private List<Item> getData() {
        List<Item> data = new ArrayList<>();
        int icons[] = {R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a};
        String[] names = {"Sherlock", "Dr.Watson", "Mr.Robot", "Harry Potter", "Cap'n Price", "Soap McTavish", "Mike Baxter", "Logan", "X"};
        String[] status = {"Hello", "Hi there", "Busy", "No calls", "WhatsApp only", "bleh", "What's up?", "Sleeping", "At the movies"};
        for(int i = 0; i < names.length; i++) {
            Item current = new Item();
            current.iconid = icons[i];
            current.title = names[i];
            current.descript = status[i];
            data.add(current);
        }
        return data;
    }

}
