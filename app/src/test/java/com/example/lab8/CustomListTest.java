package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import android.content.Context;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * check if hasCity returns correct boolean value
     */
    @Test
    public void HasCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(),listSize + 1);
        boolean result = list.hasCity(new City("Edmonton", "AB"));
        assertTrue(result);
    }

    /**
     * first get count
     * then add a city and increase count by 1
     * then delete city
     * check count minus 1
     */
    @Test
    public void DeleteCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(),listSize + 1);
        list.deleteCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(),listSize);
    }

    /**
     * first get count
     * then add a (or two cities) city and increase count by 1 (or 2)
     * then count city
     * check count increased by 1 (or 2)
     */
    @Test
    public void CountCitiesTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Tokyo", "JP"));
        list.countCities();
        assertEquals(list.getCount(),listSize + 2);
    }

}
