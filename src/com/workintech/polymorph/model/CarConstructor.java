package com.workintech.polymorph.model;

public class CarConstructor {
    private String name;
    private String description;

    public CarConstructor(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        return getName() + "starting engine...";
    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving...";
    }

    public void runEngine(CarConstructor carConstructor) {
        if (carConstructor instanceof GasPoweredCar) {
            System.out.println("Gas engine is running...");
        } else if(carConstructor instanceof  ElectricCar){
            System.out.println("Electric engine is running...");
        } else if(carConstructor instanceof HybridCar){
            System.out.println("Hybrid engine is running...");
        } else{
            System.out.println("Null");
        }


    }
}
