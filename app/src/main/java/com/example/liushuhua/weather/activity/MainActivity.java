package com.example.liushuhua.weather.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import com.example.liushuhua.weather.BaseActivity;
import com.example.liushuhua.weather.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolBar)
    Toolbar toolBar;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolBar.setTitle(getString(R.string.main_title));
        toolBar.setTitleTextColor(Color.parseColor("#ffffff"));
        ActionBarDrawerToggle mActionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolBar,R.string.drawer_layout_open, R.string.drawer_layout_close);
        mActionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        mActionBarDrawerToggle.setHomeAsUpIndicator(R.mipmap.ic_launcher);//change the icon
        mActionBarDrawerToggle.syncState();//show the default icon and sync the
        drawerLayout.addDrawerListener(mActionBarDrawerToggle);
    }
}
