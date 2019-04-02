package com.example.xkcdreader.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.xkcdreader.R;

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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void setImage(String url) {
        Glide.with(this)
                .load(url)
                .apply(new RequestOptions()
                .placeholder(R.mipmap.ic_launcher)
                .fitCenter())
                .into(iv);
    }
}
