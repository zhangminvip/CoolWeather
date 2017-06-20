package com.example.coolweather.gson;

/**
 * Created by tom on 2017/6/20.
 */

public class AQI {
    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
