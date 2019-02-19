package com.example.xkcdreader.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xkcdreader.R;
import com.example.xkcdreader.controller.MainController;
import com.example.xkcdreader.model.*;
import com.example.xkcdreader.view.adapter.AdapterMainLayout;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    // Attributes

    private MainController controller;

    private ArrayList<Comic> listOfComics; //TODO might be useless, the future will tell

    public RecyclerView recyclerView;
    public AdapterMainLayout rvAdapter;
    public RecyclerView.LayoutManager rvLayoutManager;

    // Methods

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing attributes
        listOfComics = new ArrayList<>();

        //managing view
        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        rvLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rvLayoutManager);
        rvAdapter = new AdapterMainLayout();
        recyclerView.setAdapter(rvAdapter);

        //creating controller
        controller = new MainController(this);
    }

    public void addComic(Comic addedComic) {
        listOfComics.add(addedComic);
    } //TODO might be useless
}
