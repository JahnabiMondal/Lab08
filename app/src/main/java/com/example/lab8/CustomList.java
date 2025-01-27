package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * this gets size of the list
     * @return size of list
     */
    public int getCount(){
        return cities.size();
    }

    /**
     * this adds city object to the list
     * @param city
     */
    public void addCity(City city){
        cities.add(city);

    }

    /**
     * this method checks if the city name already exists in the list
     * @param city
     * @return
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * this method deletes the name of the city if it exists in the list, if not then throws an exception
     * @param city the name of the city
     */
    public void deleteCity(City city) {
        if (hasCity(city))
            cities.remove(city);
    }

    /**
     * this method counts how many cities are there in the list
     */
    public void countCities() {
        List list = cities;
        int count = list.size();
    }

}
