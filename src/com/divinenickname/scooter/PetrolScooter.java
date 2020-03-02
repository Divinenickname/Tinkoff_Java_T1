package com.divinenickname.scooter;

import com.divinenickname.engines.IEngine;
import com.divinenickname.engines.PetrolEngine;
import com.divinenickname.powerElements.Tank;
import com.divinenickname.speedometers.Speedometer;
import com.divinenickname.wheels.Wheel;

public class PetrolScooter extends Scooter {
    private Tank tank;

    @Override
    public String getStatus() {
        return "Fuel: " + tank.getCurrentCapacity();
    }

    public PetrolScooter(String model, String color, int numOfWheels, Wheel wheel, PetrolEngine engine, Tank tank, Speedometer speedometer) {
        super(model, color, numOfWheels, engine, wheel, speedometer);
        this.tank = tank;
    }

}
