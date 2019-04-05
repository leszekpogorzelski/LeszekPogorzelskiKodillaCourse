package com.kodilla.good.patterns.food;

import java.util.Map;

public class Order implements FoodOrder {
    private FoodSupplier foodSupplier;
    private ProductsOrdered productsOrdered;

    public Order(FoodSupplier foodSupplier, ProductsOrdered productsOrdered){
        this.foodSupplier = foodSupplier;
        this.productsOrdered = productsOrdered;
    }

    @Override
    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    @Override
    public Map<Integer, String> getProducts() {
        return productsOrdered.getProductsOrdered();
    }

    @Override
    public String proces() {
        return foodSupplier.getProcess().getProcess1();

    }
}
