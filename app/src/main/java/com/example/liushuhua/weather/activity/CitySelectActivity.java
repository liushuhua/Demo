package com.example.liushuhua.weather.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.liushuhua.weather.BaseActivity;
import com.example.liushuhua.weather.R;
import com.example.liushuhua.weather.model.Province;

public class CitySelectActivity extends BaseActivity {
    private static String provinceName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_select);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public static void actionStart(Context context, Province province) {
        Intent it = new Intent(context, CitySelectActivity.class);
        context.startActivity(it);
        provinceName = province.getName();
    }
}
