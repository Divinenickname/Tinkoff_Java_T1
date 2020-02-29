package com.divinenickname.scooter;

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

    public ElectricScooter(String model, String color, int numOfWheels, Accumulator accumulator, Wheel wheel) {
        super(model, color, numOfWheels, wheel);
        this.accumulator = accumulator;
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

    public void charge(){
        accumulator.startCharging();
    }

}
