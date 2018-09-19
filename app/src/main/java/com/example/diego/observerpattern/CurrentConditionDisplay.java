package com.example.diego.observerpattern;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.diego.observerpattern.Interface.DisplayElement;
import com.example.diego.observerpattern.Interface.Observer;
import com.example.diego.observerpattern.Interface.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;
    private static Context con = MainActivity.getContext();


    CurrentConditionDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        Log.d("msg:", "t->" + temperature+" h-> "+humidity);
        //tv.setText(temperature + "F - " + humidity + "%");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
