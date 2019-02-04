package com.example.xkcdreader.model;

import java.util.ArrayList;

public class ComicsList {

    // Variables

    private ArrayList<Comic> listOfComics;

    // Constructor

    public ComicsList(ArrayList<Comic> listOfComics) {
        this.listOfComics = listOfComics;
    }

    // Accessors

    public ArrayList<Comic> getListOfComics() {
        return listOfComics;
    }

    public int getSize() {
        return listOfComics.size();
    }
}
