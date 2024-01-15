package com.kid.gp_back.service;

import com.kid.gp_back.entity.Dish;
import com.kid.gp_back.entity.DishSort;
import com.kid.gp_back.mapper.DishesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class DishesService {

    @Value("${file-save-path}")
    String fileSavePath;

    @Value("${myhost}")
    String host;
    @Autowired
    DishesMapper dishesMapper;

    public List<Dish> getDishList(){
        List<Dish> dishList = dishesMapper.getPreDishesList();
        for (Dish dish :
                dishList) {
            String pic_path = "http://"+host+":8081/images/"+dish.getDish_pic();
            dish.setDish_pic(pic_path);
        }

        return dishList;
    }

    public LinkedHashMap<String,DishSort> getDishSortMap(){
        List<DishSort> dishSortList = dishesMapper.getDishesSort();
        LinkedHashMap<String,DishSort> map = new LinkedHashMap<>();
        for (DishSort dishSort :
                dishSortList) {
            //重写图片url
            String pic_path = "http://"+host+":8081/images/" + dishSort.getDish_sort_pic().replace('\\','/');
            dishSort.setDish_sort_pic(pic_path);

            dishSort.setDishes(new ArrayList<>());

            String sort = dishSort.getDish_sort();
            map.put(sort,dishSort);
        }
        return map;
    }

}
