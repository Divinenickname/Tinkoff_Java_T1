package com.divinenickname.scooter;

import com.divinenickname.engines.ElectricEngine;
import com.divinenickname.interfaces.Brake;
import com.divinenickname.engines.IEngine;
import com.divinenickname.interfaces.Gas;
import com.divinenickname.wheels.Wheel;

public abstract class Scooter implements Gas, Brake {
    /**
     * Model name
     */
    private String model;
    /**
     * Base color
     */
    private String color;
    /**
     * Maybe you wanna make 4 wheels or Wunderwaffe?
     */
    private int numOfWheels;

    /**
     * Some engine
     */
    private IEngine engine;

    private Wheel wheel;
    /**
     * It used default electric motor
     * @param model Just name it!
     * @param color Color like a blue;
     */
    Scooter(String model, String color, int numOfWheels, Wheel wheel){
        this.color = color;
        this.model = model;
        this.numOfWheels = numOfWheels;
        this.wheel = wheel;
    }

    Scooter(String model, String color, int numOfWheels, IEngine engine, Wheel wheel){
        this(model, color, numOfWheels, wheel);
        this.engine = engine;
    }

    @Override
    public void gas() {
        System.out.println("Wrrr-wrrr");
    }

    @Override
    public void brake() {
        System.out.println("Stopping...");
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public String getStatus();

    public void start(){
        engine.startEngine();
        System.out.println("Scooter powered on");
    }

    public void stop(){
        engine.stopEngine();
        System.out.println("Scooter powered off");
    }
}
