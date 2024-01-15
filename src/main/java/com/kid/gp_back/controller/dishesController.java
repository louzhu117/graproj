package com.kid.gp_back.controller;

import com.kid.gp_back.entity.Dish;
import com.kid.gp_back.entity.DishSort;
import com.kid.gp_back.mapper.DishesMapper;
import com.kid.gp_back.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class dishesController {

    @Autowired
    DishesMapper dishesMapper;

    @Autowired
    DishesService dishesService;


    @GetMapping("/ILOVEYOU")
    public String love(){
        return "我爱你";
    }

    @GetMapping("/h")
    public String hello(){
        return "hello";
    }

    @GetMapping("/GET/dishes")
    public Object getDishes(){
        //拿到菜单
        List<Dish> dishList= dishesService.getDishList();
        LinkedHashMap<String,DishSort> dishSortMap = dishesService.getDishSortMap();
        //数据整理 得到一个排好序的菜单
        for (Dish dish:
             dishList) {
            String dishSortName = dish.getDish_sort();
            List<Dish> dishes = dishSortMap.get(dishSortName).getDishes();
            dishes.add(dish);
        }
        List<DishSort> dishSortList = new ArrayList<>();
        for (Map.Entry<String,DishSort> entry:
             dishSortMap.entrySet()) {
            dishSortList.add(entry.getValue());
        }
        return dishSortList;
    }
}
