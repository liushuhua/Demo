package com.example.liushuhua.weather.utils;

import android.widget.Toast;

import com.example.liushuhua.weather.MyApplication;

/**
 * Created by LiuShuHua on 2017/5/26.
 * description：
 */

public class ToastUtils {
    public static void showToast(String tip) {
        Toast.makeText(MyApplication.getContext(), tip, Toast.LENGTH_SHORT).show();
    }
}
