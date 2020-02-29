package com.divinenickname.scooter;

import com.divinenickname.engines.ElectricEngine;
import com.divinenickname.powerElements.Accumulator;
import com.divinenickname.wheels.Wheel;

/**
 * Electric scooter with accumulator
 */
public class ElectricScooter extends Scooter {
    /**
     * power element
     */
    private Accumulator accumulator;
    private ElectricEngine engine;

    public ElectricScooter(String model, String color, int numOfWheels,
                           Accumulator accumulator, Wheel wheel, ElectricEngine engine) {
        super(model, color, numOfWheels, wheel);
        this.accumulator = accumulator;
        this.engine = engine;
        this.engine.setAccumulator(accumulator);
    }

    @Override
    public String getStatus() {
        String message = "Current accumulator capacity is: ";

        if(accumulator.getCurrentCapacity() == 0) {
            message += "0%";
        }
        else {
            double capacity = (double) accumulator.getCurrentCapacity()/accumulator.getMaxCapacity();
            message += (int)(capacity*100) + "%";
        }
        return message;

    }

    @Override
    public void start() {
        engine.startEngine();
    }

    public void charge(){
        accumulator.startCharging();
    }

}
