package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temparature temparature;

    @SerializedName("cond")
    public More more;

    public class Temparature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
