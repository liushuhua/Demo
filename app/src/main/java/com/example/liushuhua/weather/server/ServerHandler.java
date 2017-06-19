package com.example.liushuhua.weather.server;

import com.example.liushuhua.weather.model.Province;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LiuShuHua on 2017/6/14.
 * description：
 */

public class ServerHandler {

    private static volatile ServerHandler serverHandler;
    private static HttpServer httpServer;

    public static ServerHandler getInstance() {
        if (serverHandler == null) {
            synchronized (ServerHandler.class) {
                if (serverHandler == null) {
                    serverHandler = new ServerHandler();
                    initRetrofit();
                }
            }
        }
        return serverHandler;
    }

    private static void initRetrofit() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(ServerConstance.BASE_PATH).
                addConverterFactory(GsonConverterFactory.create(gson)).
                build();
        httpServer = retrofit.create(HttpServer.class);
    }

    public void getProvinceList(Callback<List<Province>> callback) {
        Call<List<Province>> call = httpServer.getProvinceList("china");
        call.enqueue(callback);
    }
}
