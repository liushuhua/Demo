package com.example.liushuhua.weather.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liushuhua.weather.R;

/**
 * Created by LiuShuHua on 2017/5/29.
 * description：
 */

public class MainFragment extends Fragment {

    private View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main,container,true);
        return rootView;
    }
}
