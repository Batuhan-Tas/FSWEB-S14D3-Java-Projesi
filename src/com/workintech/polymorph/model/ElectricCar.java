package com.workintech.polymorph.model;

public class ElectricCar extends CarConstructor {

    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
}
