package com.kodilla.good.patterns.food;

import java.util.Map;

public interface FoodOrder {

    FoodSupplier getFoodSupplier();

    Map<Integer, String> getProducts();

    String proces();
}
