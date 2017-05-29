package com.example.liushuhua.weather.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.liushuhua.weather.BaseActivity;
import com.example.liushuhua.weather.R;
import com.example.liushuhua.weather.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    @BindView(R.id.toolBar)
    Toolbar toolBar;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolBar.setTitle(getString(R.string.main_title));
        toolBar.setTitleTextColor(Color.parseColor("#ffffff"));
        ActionBarDrawerToggle mActionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.drawer_layout_open, R.string.drawer_layout_close);
        mActionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        mActionBarDrawerToggle.setHomeAsUpIndicator(R.mipmap.ic_launcher);//change the icon
        mActionBarDrawerToggle.syncState();//show the default icon and sync the
        drawerLayout.addDrawerListener(mActionBarDrawerToggle);
        navView.setCheckedItem(R.id.menu_first);
        navView.setNavigationItemSelectedListener(this);
        View headerView= navView.getHeaderView(0);
        headerView.findViewById(R.id.add_city).setOnClickListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawers();
        switch (item.getItemId()) {
            case R.id.menu_first:
                ToastUtils.showToast("First item selected");
                break;
            case R.id.menu_second:
                ToastUtils.showToast("Second item selected");
                break;
            case R.id.menu_third:
                ToastUtils.showToast("Third item selected");
                break;
            case R.id.menu_fourth:
                ToastUtils.showToast("Fourth item selected");
                break;
            case R.id.menu_fifth:
                ToastUtils.showToast("Fifth item selected");
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.add_city){
            ToastUtils.showToast("Add City");
        }
    }
}
