package com.kodilla.good.patterns.food;

public class FoodSupplier {
    private String companyName;
    private String address;
    private OrderProcess orderProcess;

    public FoodSupplier(String companyName, String address, OrderProcess orderProcess) {
        this.companyName = companyName;
        this.address = address;
        this.orderProcess = orderProcess;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public OrderProcess getProcess() {
        return orderProcess;
    }
}
