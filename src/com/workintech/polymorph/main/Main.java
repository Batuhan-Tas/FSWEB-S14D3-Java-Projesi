package com.workintech.polymorph.main;
import com.workintech.polymorph.model.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("-------------------------");

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("-------------------------");

        CarConstructor electricCar = new ElectricCar("Tesla", "Electric", 350, 2);
        CarConstructor gasCar = new GasPoweredCar("Hyundai", "Gas", 400, 4);
        CarConstructor hybridCar = new HybridCar("Toyota", "Electric", 450, 4, 4);
        System.out.println(electricCar.drive());
        System.out.println(gasCar.drive());
        System.out.println(hybridCar.drive());


    }
}