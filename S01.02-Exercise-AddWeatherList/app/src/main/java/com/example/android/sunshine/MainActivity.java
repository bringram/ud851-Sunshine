/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.sunshine.data.DummyWeatherService;
import com.example.android.sunshine.data.WeatherService;

public class MainActivity extends AppCompatActivity {

    // COMPLETE (1) Create a field to store the weather display TextView
    private TextView weatherDisplayTextView;
    private WeatherService weatherService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ideally this would be injected some other way...
        weatherService = new DummyWeatherService();

        setContentView(R.layout.activity_forecast);

        // COMPLETE (2) Use findViewById to get a reference to the weather display TextView
        weatherDisplayTextView = (TextView) findViewById(R.id.tv_weather_data);

        // COMPLETE (3) Create an array of Strings that contain fake weather data
        String[] weatherData = weatherService.getWeatherData();

        // COMPLETE (4) Append each String from the fake weather data array to the TextView
        for (String dayWeather : weatherData) {
            weatherDisplayTextView.append(dayWeather + "\n\n\n");
        }
    }
}