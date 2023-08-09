package com.workintech.polymorph.model;

public class HybridCar extends CarConstructor{

    private double avgKmPerLitre;
    private int batterySize;

    private int cylinders;
    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize,int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
