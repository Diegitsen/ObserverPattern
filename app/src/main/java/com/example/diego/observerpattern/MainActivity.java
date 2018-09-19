package com.example.diego.observerpattern;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    WeatherData weatherData;
    private static Context mContext;

    public static Context getContext()
    {
        return mContext;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherData= new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);


    }

    void onClick(View v)
    {
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(50, 45, 87.4f);
        weatherData.setMeasurements(10, 35, 22.4f);
    }
}
