package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.TextureView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_for_day);

        // COMPLETE (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();

        if (intent.hasExtra(Intent.EXTRA_TEXT)) {
            String weatherForDay = intent.getStringExtra(Intent.EXTRA_TEXT);
            mWeatherTextView.setText(weatherForDay);
        }
    }
}