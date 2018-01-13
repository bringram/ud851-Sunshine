package com.example.android.sunshine.data;

/**
 * Created by bringram on 1/13/18.
 */

public class DummyWeatherService implements WeatherService {

    public String[] getWeatherData() {
        String[] dummyWeatherData = {
                "Today, January 13 - Clear - 17°F / 15°F",
                "Tomorrow, January 14 - Cloudy - 19°F / 15°F",
                "Monday - Rainy - 30°F / 11°F",
                "Tuesday - Thunderstorms - 21°F / 9°F",
                "Wednesday - Thunderstorms - 16°F / 7°F",
                "Thursday - Rainy - 16°F / 8°F",
                "Friday - Partly Cloudy - 15°F / 10°F",
                "Sat, Jan 20 - Meatballs - 16°F / 18°F",
                "Sun, Jan 21 - Cloudy - 19°F / 15°F",
                "Mon, Jan 22 - Stormy - 30°F / 11°F",
                "Tue, Jan 23 - Hurricane - 21°F / 9°F",
                "Wed, Jan 24 - Meteors - 16°F / 7°F",
                "Thu, Jan 25 - Apocalypse - 16°F / 8°F",
                "Fri, Jan 26 - Post Apocalypse - 15°F / 10°F",
        };

        return dummyWeatherData;
    }

}
