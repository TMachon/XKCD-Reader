package com.example.xkcdreader.model;

import java.util.ArrayList;

public class ComicsList {

    // Variables

    private ArrayList<Comic> listOfComics;
    private int size;

    // Accessors

    public ArrayList<Comic> getListOfComics() {
        return listOfComics;
    }

    public void setListOfComics(ArrayList<Comic> listOfComics) {
        this.listOfComics = listOfComics;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
