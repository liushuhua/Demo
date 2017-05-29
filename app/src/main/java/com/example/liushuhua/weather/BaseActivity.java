package com.example.liushuhua.weather;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.liushuhua.weather.manager.ActivityManager;

/**
 * Created by LiuShuHua on 2017/5/23.
 * description：
 */

public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.getInstance().addActivityList(this);
    }

    @Override
    public void finish() {
        ActivityManager.getInstance().removeActivityList(this);
        super.finish();
    }
}
