package com.example.xkcdreader.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.xkcdreader.R;

public class ComicActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic);

        Intent intent = getIntent();
        tv = findViewById(R.id.COMIC);
        int id = intent.getIntExtra("ID", -1);
        tv.setText(id);
    }
}
