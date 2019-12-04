package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();
        Vehicle truck = new Truck();
        Vehicle raceCar = new RaceCar();

        Vehicle[] vehicles = {vehicle,car,plane,ship,truck,raceCar};

        for (Vehicle v : vehicles) {
            if(v instanceof RaceCar){
                ((RaceCar) v).go();
                ((RaceCar) v).horn();
                ((RaceCar) v).turbo();
            }
            else if(v instanceof Truck){
                ((Truck) v).go();
                ((Truck) v).height();
                ((Truck) v).horn();
            }
            else if(v instanceof Car)
            {
                ((Car) v).go();
                ((Car) v).horn();
            }
            else if (v instanceof Plane)
            {
                ((Plane) v).go();
                ((Plane) v).speed();
            }
            else if(v instanceof Ship)
            {
                ((Ship) v).go();
                ((Ship) v).staff();
            }
            else
            {
                v.go();
            }
            System.out.println("############################");
        }
    }
}
