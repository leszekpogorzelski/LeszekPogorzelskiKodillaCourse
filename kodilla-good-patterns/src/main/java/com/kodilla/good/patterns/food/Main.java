package com.kodilla.good.patterns.food;

public class Main {

    public static void main(String[] srgs) {

        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retrive1();
        System.out.println(order.getFoodShop().getFoodSupplier());
        System.out.println(order.getFoodShop().getProducts().entrySet());
        System.out.println(order.getFoodShop().process());


    }
}
