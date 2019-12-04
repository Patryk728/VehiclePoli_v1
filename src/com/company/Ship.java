package com.company;

public class Ship extends Vehicle {
    public Ship() {
    }

    @Override
    public void go() {

        System.out.println("Statek rusza");
    }

    void staff()
    {
        System.out.println("Załoga statku wynosi 3 osoby");
    }
}
