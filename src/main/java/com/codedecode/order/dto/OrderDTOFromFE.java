package com.codedecode.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {

    private List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;

//    public Object getFoodItemsList() {
//        return foodItemsList;
//    }
//
//    public void setFoodItemsList(Object foodItemsList) {
//        this.foodItemsList = (List<FoodItemsDTO>) foodItemsList;
//    }

//    public Object getRestaurant() {
//        return restaurant;
//    }
//
//    public void setRestaurant(Object restaurant) {
//        this.restaurant = (Restaurant) restaurant;
//    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
