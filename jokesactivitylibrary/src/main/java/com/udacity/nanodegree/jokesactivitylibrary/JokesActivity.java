package com.udacity.nanodegree.jokesactivitylibrary;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        if (getIntent() != null) {
            ((TextView) findViewById(R.id.joke)).setText(getIntent().getStringExtra(JOKE_EXTRA));
        }
    }
}
