package com.company;

public class Car extends Vehicle {
    public Car() {
    }

    @Override
    public void go() {

        System.out.println("Auto rusza");
    }
    void horn(){
        System.out.println("Beep beep");
    }
}
