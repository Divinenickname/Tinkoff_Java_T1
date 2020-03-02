package com.divinenickname;

import com.divinenickname.engines.ElectricEngine;
import com.divinenickname.engines.PetrolEngine;
import com.divinenickname.powerElements.Accumulator;
import com.divinenickname.powerElements.LiPolAccumulator;
import com.divinenickname.powerElements.Tank;
import com.divinenickname.scooter.ElectricScooter;
import com.divinenickname.scooter.PetrolScooter;
import com.divinenickname.scooter.Scooter;
import com.divinenickname.speedometers.AmericanSpeedometer;
import com.divinenickname.speedometers.Speedometer;
import com.divinenickname.wheels.Wheel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tank defTank = new Tank(100, 55);
        ElectricEngine electricEngine = new ElectricEngine(150);
        PetrolEngine petrolEngine = new PetrolEngine(defTank);
        Accumulator accumulator = new LiPolAccumulator(10000, 2, 24, 5, 2000);
        Speedometer speedometer = new AmericanSpeedometer();


        Wheel pirelli = new Wheel(3, "Pirelli", true, "StreetDestroyer", 40, 20);
        Scooter elScooter = new ElectricScooter("Xiaomi", "Black", 2, electricEngine, accumulator, pirelli, speedometer);

        elScooter.start();
        System.out.println(elScooter.getStatus());

        List<String> list = new ArrayList<>();


        Scooter petrol = new PetrolScooter("Xiaomi", "black", 2, pirelli, petrolEngine, defTank, speedometer);
        petrol.start();
        System.out.println(petrol.getStatus());
        System.out.println("test");

    }
}
