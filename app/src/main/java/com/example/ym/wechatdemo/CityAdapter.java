package com.example.ym.wechatdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by YM on 2017/3/5.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {


    private List<City> mCityList;

    static class ViewHolder extends  RecyclerView.ViewHolder{

        TextView cityName ;
        public ViewHolder(View view){
            super(view);
            cityName = (TextView)view.findViewById(R.id.text);

        }
    }

    public CityAdapter(List<City> cityList){
        mCityList = cityList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_name,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        City city = mCityList.get(position);
        holder.cityName.setText(city.getCityName());
    }

    @Override
    public int getItemCount() {
        return mCityList.size();
    }
}
