package com.example.liushuhua.weather.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.liushuhua.weather.R;
import com.example.liushuhua.weather.activity.CitySelectActivity;
import com.example.liushuhua.weather.model.Province;

import java.util.List;


/**
 * Created by LiuShuHua on 2017/6/14.
 * description：
 */

public class ProvinceItemAdapter extends RecyclerView.Adapter<ProvinceItemAdapter.ViewHolder> {

    private Context context;
    private List<Province> provinceList;

    public ProvinceItemAdapter(Context context, List<Province> provinceList) {
        this.context = context;
        this.provinceList = provinceList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.city_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Province province = provinceList.get(position);
        holder.province.setText(province.getName());
    }

    @Override
    public int getItemCount() {
        return provinceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView province;

        public ViewHolder(final View itemView) {
            super(itemView);
            province = (TextView) itemView.findViewById(R.id.city);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CitySelectActivity.actionStart(context,provinceList.get(getItemCount()));
                }
            });
        }
    }
}
