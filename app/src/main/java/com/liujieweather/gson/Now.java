package com.liujieweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 11419 on 2018/3/26.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }
}
