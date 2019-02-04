package com.example.xkcdreader.controller.API;

import retrofit2.*;
import com.example.xkcdreader.model.*;

import java.util.ArrayList;

public abstract class APIManager implements APIManagerInterface {

    /**
     *  Trying to make methods that return the required Comic object from the API
     */

    // attributes

    private static Comic returnedComic = new Comic();

    // private methods

    private static void APIgetLastComicId() {
        Call<Comic> call =  RetrofitBuilder.getService().lastComic();
        call.enqueue(new Callback<Comic>() {
            @Override
            public void onResponse(Call<Comic> call, Response<Comic> response) {
                if (response.isSuccessful()) {
                    Comic currentComic = response.body();
                    assert currentComic != null;
                    returnedComic = currentComic;
                }
                else {
                    returnedComic = new Comic();
                    returnedComic.setNum(-1);
                }
            }
            @Override
            public void onFailure(Call<Comic> call, Throwable t) {
                returnedComic = new Comic();
                returnedComic.setNum(-2);
            }
        });
    }

    public static void APIgetComicById(int id) {
        Call<Comic> call = RetrofitBuilder.getService().comicById(id);
        call.enqueue(new Callback<Comic>() {
            @Override
            public void onResponse(Call<Comic> call, Response<Comic> response) {
                if (response.isSuccessful()) {
                    Comic currentComic = response.body();
                    assert currentComic != null;
                    returnedComic = currentComic;
                }
                else {
                    returnedComic = new Comic();
                    returnedComic.setTitle("ERROR1.1");
                }
            }
            @Override
            public void onFailure(Call<Comic> call, Throwable t) {
                returnedComic = new Comic();
                returnedComic.setTitle("ERROR1.2");
            }
        });
    }

    // public methods

    public static int getLastComicId() {
        APIgetLastComicId();
        return returnedComic.getNum();
    }

    public static Comic getComicById(int id) {
        APIgetComicById(id);
        return returnedComic;
    }

    public static ArrayList<Comic> getAllComics() {
        int last = getLastComicId();
        ArrayList<Comic> list = new ArrayList<Comic>();
        for (int i=0; i<=last; i++) {
            list.add(getComicById(i));
        }
        return list;
    }

}
