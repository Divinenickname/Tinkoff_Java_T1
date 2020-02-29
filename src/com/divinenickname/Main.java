package com.divinenickname;

import com.divinenickname.engines.PetrolEngine;
import com.divinenickname.powerElements.LiPolAccumulator;
import com.divinenickname.powerElements.Tank;
import com.divinenickname.scooter.ElectricScooter;
import com.divinenickname.scooter.PetrolScooter;
import com.divinenickname.scooter.Scooter;
import com.divinenickname.wheels.Wheel;

public class Main {

    public static void main(String[] args) {
        Wheel pirelli = new Wheel(3, "Pirelli", true, "StreetDestroyer", 40, 20);
        /*Scooter scooter = new ElectricScooter("Xiaomi", "Black", 2,
                new LiPolAccumulator(18000, 5, 12, 3, 2500), pirelli);

        ((ElectricScooter) scooter).charge();
        System.out.println(scooter.getStatus());

        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());*/

        Scooter petrol = new PetrolScooter("Xiaomi", "black", 2, pirelli,
                new PetrolEngine();

    }
}
