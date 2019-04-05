package com.kodilla.good.patterns.food;

public class Main {

    public static void main(String[] srgs) {

        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retrive1();
        System.out.println(order.getFoodSupplier().getCompanyName() + "\n"
                + order.getFoodSupplier().getAddress() + "\n");
        System.out.println(order.getProducts().entrySet() + "\n" + order.proces());

    }
}
