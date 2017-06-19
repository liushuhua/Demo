package com.example.liushuhua.weather.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.liushuhua.weather.BaseActivity;
import com.example.liushuhua.weather.R;
import com.example.liushuhua.weather.adapter.ProvinceItemAdapter;
import com.example.liushuhua.weather.model.Province;
import com.example.liushuhua.weather.server.ServerHandler;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProvinceSelectActivity extends BaseActivity {
    @BindView(R.id.cover)
    ImageView cover;
    @BindView(R.id.input)
    EditText input;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province_select);
        ButterKnife.bind(this);
        Connector.getDatabase();
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Province> provinces = DataSupport.findAll(Province.class);
        if (provinces != null && provinces.size() > 0) {
            initProvince(provinces);
        } else {
            initCity();
        }
    }

    private void initCity() {
        ServerHandler.getInstance().getProvinceList(new Callback<List<Province>>() {
            @Override
            public void onResponse(Call<List<Province>> call, Response<List<Province>> response) {
                initProvince(response.body());

            }

            @Override
            public void onFailure(Call<List<Province>> call, Throwable t) {
            }
        });

    }

    private void initProvince(List<Province> provinceList) {
        for (Province province: provinceList){
            province.save();
        }
        ProvinceItemAdapter adapter = new ProvinceItemAdapter(ProvinceSelectActivity.this, provinceList);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 6);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    public static void openActivity(Activity lastActivity, String param1, String param2) {
        Intent it = new Intent(lastActivity, ProvinceSelectActivity.class);
        lastActivity.startActivity(it);
    }
}
