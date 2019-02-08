package com.example.xkcdreader.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.xkcdreader.R;
import com.example.xkcdreader.controller.API.RetrofitBuilder;
import com.example.xkcdreader.model.*;
import com.example.xkcdreader.view.MainActivity;

import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainController {

    // Attributes

    private ArrayList<Comic> listOfComics;
    private int latestComicId;

    // Constructor

    public MainController(final MainActivity a) {
        listOfComics = new ArrayList<>();

        Call<Comic> call = RetrofitBuilder.getService().lastComic();
        call.enqueue(new Callback<Comic>() {
            @Override
            public void onResponse(Call<Comic> call, Response<Comic> response) {
                if (response.isSuccessful()) {
                    Comic currentComic = response.body();
                    assert currentComic != null;
                    latestComicId = Integer.valueOf(currentComic.getNum());

                    for (int i=latestComicId; i>0; i--) {
                        RetrofitBuilder.getService().comicById(i).enqueue(new Callback<Comic>() {
                            @Override
                            public void onResponse(Call<Comic> call, Response<Comic> response) {
                                if (response.isSuccessful()) {
                                    Comic pointedComic = response.body();
                                    assert pointedComic != null;
                                    listOfComics.add(pointedComic);
                                } else {
                                    // TODO
                                }
                            }

                            @Override
                            public void onFailure(Call<Comic> call, Throwable t) {
                                //TODO
                            }
                        });
                    }


                } else {
                    latestComicId = -1;
                    // TODO
                }
            }

            @Override
            public void onFailure(Call<Comic> call, Throwable t) {
                latestComicId = -2;
                //TODO
            }
        });

    }


    // Methods


    // Accessors

    public ArrayList<Comic> getListOfComics() {
        return listOfComics;
    }

    public int getLatestComicId() {
        return latestComicId;
    }
}

