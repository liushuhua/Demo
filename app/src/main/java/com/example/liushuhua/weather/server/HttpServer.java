package com.example.liushuhua.weather.server;

import com.example.liushuhua.weather.model.Province;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by LiuShuHua on 2017/6/14.
 * description：
 */

public interface HttpServer {
    @GET("{name}")
    Call<List<Province>> getProvinceList(@Path("name") String name);

}
