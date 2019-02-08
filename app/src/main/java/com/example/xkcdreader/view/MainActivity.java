package com.example.xkcdreader.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

import com.example.xkcdreader.R;
import com.example.xkcdreader.controller.MainController;
import com.example.xkcdreader.model.*;
import com.example.xkcdreader.view.adapter.AdapterMainLayout;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    // Attributes

    private MainController controller;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    // Methods

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new MainController(this);
        //controller.promptLastComic(this);
        //controller.promptComicWithId(this, 18);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<String> input = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            input.add("Test" + i);
        }// define an adapter
        mAdapter = new AdapterMainLayout(input);
        recyclerView.setAdapter(mAdapter);

    }
}
