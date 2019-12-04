package com.company;

public class RaceCar extends Car {
    public RaceCar() {
    }

    @Override
    public void go() {

        System.out.println("Sportowe auto rusza");
    }

    @Override
    void horn() {
        super.horn();
    }

    public void turbo()
    {
        System.out.println("glosny ryk silnika");
    }
}
