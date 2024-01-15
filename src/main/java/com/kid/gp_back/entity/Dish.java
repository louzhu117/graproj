package com.kid.gp_back.entity;

public class Dish {
    int id;
    String dish_name;
    String dish_sort;
    String dish_pic;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getDish_sort() {
        return dish_sort;
    }

    public void setDish_sort(String dish_sort) {
        this.dish_sort = dish_sort;
    }

    public String getDish_pic() {
        return dish_pic;
    }

    public void setDish_pic(String dish_pic) {
        this.dish_pic = dish_pic;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", dish_name='" + dish_name + '\'' +
                ", dish_sort='" + dish_sort + '\'' +
                ", dish_pic='" + dish_pic + '\'' +
                '}';
    }
}
