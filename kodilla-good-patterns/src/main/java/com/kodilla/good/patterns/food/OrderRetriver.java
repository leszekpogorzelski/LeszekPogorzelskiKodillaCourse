package com.kodilla.good.patterns.food;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriver {

    public Order retrive1() {
        OrderProcess orderProcess = new OrderProcess("Zamówienie zostało złożone w sklepie ExtraFood Shoop");
        FoodSupplier foodSupplier1 = new FoodSupplier("ExtraFoodShop",
                "ul. Kasztanowa 1", orderProcess);

        Map<Integer, String> products = new HashMap<>();
        products.put(2, "Jabłka");
        products.put(5, "Gruszki");

        ProductsOrdered productsOrdered = new ProductsOrdered(products);

    return new Order(foodSupplier1, productsOrdered);
}
    public Order retrive2() {
        OrderProcess orderProcess = new OrderProcess("Zamówienie zostało przyjęte do realizacji. Dziękujęmy HealthyShopp");
        FoodSupplier foodSupplier2 = new FoodSupplier("HealthyShop",
                "ul. Miodowa 5 1", orderProcess);

        Map<Integer, String> products = new HashMap<>();
        products.put(1, "Banan");
        products.put(3, "Kiwi");

        ProductsOrdered productsOrdered = new ProductsOrdered(products);

        return new Order(foodSupplier2, productsOrdered);
    }
}
