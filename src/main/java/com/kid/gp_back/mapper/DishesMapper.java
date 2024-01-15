package com.kid.gp_back.mapper;

import com.kid.gp_back.entity.Dish;
import com.kid.gp_back.entity.DishSort;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishesMapper{
    @Select("select * from t_dishes")
    List<Dish> getPreDishesList();

    @Select("SELECT * FROM t_dish_sort;")
    List<DishSort> getDishesSort();
}
