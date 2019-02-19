package com.example.xkcdreader.controller;

import com.example.xkcdreader.controller.API.RetrofitBuilder;
import com.example.xkcdreader.model.*;
import com.example.xkcdreader.view.MainActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainController {

    // Attributes
    private int latestComicId;

    // Constructor

    public MainController(final MainActivity activity) {

        Call<Comic> call = RetrofitBuilder.getService().lastComic();
        call.enqueue(new Callback<Comic>() {
            @Override
            public void onResponse(Call<Comic> call, Response<Comic> response) {
                if (response.isSuccessful()) {
                    Comic currentComic = response.body();
                    assert currentComic != null;
                    latestComicId = Integer.valueOf(currentComic.getNum());

                    for (int i = latestComicId; i > 0; i--) {
                        RetrofitBuilder.getService().comicById(i).enqueue(new Callback<Comic>() {
                            @Override
                            public void onResponse(Call<Comic> call, Response<Comic> response) {
                                if (response.isSuccessful()) {
                                    Comic pointedComic = response.body();
                                    assert pointedComic != null;
                                    activity.addComic(pointedComic);
                                    activity.rvAdapter.add(pointedComic.formatPrimary(), pointedComic.formatSecondary());

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
}

