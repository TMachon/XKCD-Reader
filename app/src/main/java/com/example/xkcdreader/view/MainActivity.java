package com.example.xkcdreader.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import com.example.xkcdreader.R;
import com.example.xkcdreader.controller.API.APIManager;
import com.example.xkcdreader.controller.API.RetrofitBuilder;
import com.example.xkcdreader.model.*;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ComicsList listOfComics;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<Comic> call = RetrofitBuilder.getService().comicById(18);
        call.enqueue(new Callback<Comic>() {
            @Override
            public void onResponse(Call<Comic> call, Response<Comic> response) {
                if (response.isSuccessful()) {
                    Comic currentComic = response.body();
                    assert currentComic != null;
                    changeMsg(currentComic.toString());
                }
                else {
                    changeMsg("ERROR1.1");
                }
            }
            @Override
            public void onFailure(Call<Comic> call, Throwable t) {
                changeMsg("ERROR1.2");
            }
        });

        /*
        String str = APIManager.getComicById(18).toString();
        str += "_testing";
        changeMsg(str);
        */
    }

    public void changeMsg(String str) {
        TextView text = (TextView) findViewById(R.id.txt_main);
        text.setText(str);
    }

    public void error() {
        TextView text = (TextView) findViewById(R.id.txt_main);
        text.setText("ERROR");
    }
}
