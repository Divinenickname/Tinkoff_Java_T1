package com.divinenickname;

import com.divinenickname.engines.ElectricEngine;
import com.divinenickname.engines.PetrolEngine;
import com.divinenickname.powerElements.Accumulator;
import com.divinenickname.powerElements.LiPolAccumulator;
import com.divinenickname.powerElements.Tank;
import com.divinenickname.scooter.ElectricScooter;
import com.divinenickname.scooter.PetrolScooter;
import com.divinenickname.scooter.Scooter;
import com.divinenickname.wheels.Wheel;

public class Main {

    public static void main(String[] args) {
        Tank defTank = new Tank(100, 55);
        ElectricEngine engine = new ElectricEngine(150);
        PetrolEngine petrolEngine = new PetrolEngine(defTank);
        Accumulator accumulator = new LiPolAccumulator(10000, 2, 24, 5, 2000);


        Wheel pirelli = new Wheel(3, "Pirelli", true, "StreetDestroyer", 40, 20);
        Scooter elScooter = new ElectricScooter("Xiaomi", "Black", 2, engine, accumulator, pirelli);

        elScooter.start();
        System.out.println(elScooter.getStatus());

        Scooter petrol = new PetrolScooter("Xiaomi", "black", 2, pirelli, petrolEngine, defTank);

    }
}
