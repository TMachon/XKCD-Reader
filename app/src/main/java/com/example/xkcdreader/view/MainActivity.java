package com.example.xkcdreader.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import com.example.xkcdreader.R;
import com.example.xkcdreader.controller.MainController;
import com.example.xkcdreader.model.*;


public class MainActivity extends AppCompatActivity {

    // Attributes

    private MainController controller;
    public TextView text;


    // Methods

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new MainController(this);
        //controller.promptLastComic(this);
        //controller.promptComicWithId(this, 18);

    }
}
