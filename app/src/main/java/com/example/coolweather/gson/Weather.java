package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tom on 2017/6/20.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI api;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;



}
