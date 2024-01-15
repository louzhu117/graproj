package com.kid.gp_back.entity;

import java.util.List;

public class DishSort {
    String dish_sort;
    List<Dish> dishes;

    String dish_sort_pic;
    public String getDish_sort() {
        return dish_sort;
    }

    public void setDish_sort(String dish_sort) {
        this.dish_sort = dish_sort;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getDish_sort_pic() {
        return dish_sort_pic;
    }

    public void setDish_sort_pic(String dish_sort_pic) {
        this.dish_sort_pic = dish_sort_pic;
    }
}
