package com.workintech.polymorph.model;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return "Ford engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return "Ford is braking";
    }
}
