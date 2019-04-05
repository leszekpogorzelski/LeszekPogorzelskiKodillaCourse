package com.kodilla.good.patterns.food;

public class Main {

    public static void main(String[] srgs) {

        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retrive1();
        System.out.println(order.proces() + "\n" +order.getProducts().entrySet());

        OrderRetriver orderRetriver1 = new OrderRetriver();
        Order order1 = orderRetriver.retrive2();

        System.out.println(order1.proces() + "\n" +order1.getProducts().entrySet());
    }
}
