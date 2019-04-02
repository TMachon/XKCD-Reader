package com.example.xkcdreader.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.xkcdreader.R;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.example.xkcdreader.controller.ComicController;

public class ComicActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic);

        /**/
        iv = (ImageView) findViewById(R.id.imageViewComic);
        Intent intent = getIntent();
        String url = intent.getStringExtra("URL");
        /**/
        setImage(url);
    }

    public void setImage(String url) {
        Glide.with(this)
                .load(url)
                .into(iv);
        TextView tv = findViewById(R.id.COMIC);
        tv.setText(url);
    }
}
