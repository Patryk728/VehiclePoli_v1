package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Auto");
        Plane plane = new Plane("Samolot");
        Ship ship = new Ship("statek");
        Truck truck = new Truck("Ciezarowka");
        RaceCar raceCar = new RaceCar("Auto sportowe");

        Vehicle[] vehicles = {car,plane,ship,truck,raceCar};

        for (Vehicle v : vehicles) {


               if(v instanceof Flying)
               {
                   v.go();
                   v.stop();
                   System.out.println("Efektywnosc paliwowa: "+v.calculateFuelConsumption());
                   ((Flying) v).callAirControl();
               }
               else
               {
                   v.go();
                   v.stop();
                   System.out.println("Efektywnosc paliwowa: "+v.calculateFuelConsumption());
               }
            System.out.println("############################");
        }
    }
}
