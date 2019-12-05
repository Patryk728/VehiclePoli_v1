package com.company;

public abstract class Vehicle {
    private String name;
    public Vehicle(String name) {
        this.name = name;
    }

    public void go(){
        System.out.println(toString()+" rusza. Typ pojazdu: "+getClass().getSimpleName());
    }
    public void stop(){
        System.out.println("Zatrzymano "+toString());
    }
    @Override
    public String toString() {
        return name;
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();
    public double calculateFuelConsumption()
    {
        double i = getFuelNeeds() / getDistance();
        return i;
    }




}
