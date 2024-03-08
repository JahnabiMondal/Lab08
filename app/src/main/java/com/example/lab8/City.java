package com.example.lab8;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }


    /**
     * This method checks if two cities and its provinces are equal based on theirs names
     * @param o
     * @return
     * referred lab06
     */
    @Override
    public boolean equals(Object o) {
        City city = (City) o;
        if(!(city instanceof City))
            return false;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }
}
