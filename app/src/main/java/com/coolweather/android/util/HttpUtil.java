package com.coolweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import static org.litepal.LitePalBase.TAG;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();

        client.newCall(request).enqueue(callback);
        Log.d(TAG, "sendOkHttpRequest: executed");

    }
}
