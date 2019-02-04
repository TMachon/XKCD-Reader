package com.example.xkcdreader.controller.API;

import retrofit2.*;
import retrofit2.http.*;
import com.example.xkcdreader.model.*;

public interface APIManagerInterface {

    @GET("info.0.json")
    Call<Comic> lastComic();

    @GET("{id}/info.0.json")
    Call<Comic> comicById(@Path("id") int id);

}
