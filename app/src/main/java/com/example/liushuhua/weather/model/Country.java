package com.example.liushuhua.weather.model;

import org.litepal.crud.DataSupport;

/**
 * Created by LiuShuHua on 2017/5/23.
 * description：
 */

public class Country extends DataSupport {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    private Integer id;
    private String name;
    private Integer code;
    private Integer cityId;
    private Integer provinceId;
}
