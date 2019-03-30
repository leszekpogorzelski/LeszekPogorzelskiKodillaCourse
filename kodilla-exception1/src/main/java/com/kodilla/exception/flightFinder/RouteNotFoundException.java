package com.kodilla.exception.flightFinder;

public class RouteNotFoundException extends Exception {

    public void answer(){
        System.out.println("Niestety nie obsługujemy tego połączenia.\n");
    }
}
