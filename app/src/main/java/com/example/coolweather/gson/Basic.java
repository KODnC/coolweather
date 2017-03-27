package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2017/3/25.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherid;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}

