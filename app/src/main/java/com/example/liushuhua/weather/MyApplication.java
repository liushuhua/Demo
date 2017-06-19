package com.example.liushuhua.weather;

import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by LiuShuHua on 2017/5/23.
 * description：
 */

public class MyApplication extends LitePalApplication {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
