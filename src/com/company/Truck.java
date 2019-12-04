package com.company;

public class Truck extends Car{
    public Truck() {
    }

    @Override
    public void go() {

        System.out.println("Ciezarowka rusza");
    }

    @Override
    void horn() {
        super.horn();
    }

    void height()
    {
        System.out.println("Ciezarowka wazy 40t");
    }
}
