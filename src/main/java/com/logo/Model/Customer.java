package com.logo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;



public class Customer {

    private static final AtomicInteger i = new AtomicInteger(0);



    private final int id;

    private String name;
    private int age;
    private boolean isActive;



    private List<Order> orderList;

    public Customer() {
        id = i.incrementAndGet();
    }

    public Customer(int id, String name, int age,boolean isActive , List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.orderList = orderList;
    }



    public Customer(String name, int age, boolean isActive, List<Order> orderList) {
        id = i.incrementAndGet();
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
