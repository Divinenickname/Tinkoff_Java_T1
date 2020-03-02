package com.divinenickname.engines;


import com.divinenickname.powerElements.Tank;

public class PetrolEngine extends FuelEngine implements IIncreasePower{

    /**
     * Basic fuel consumption without any load, milliliters
     */
    final int BASE_FUEL_CONSUMPTION = 800;

    public PetrolEngine(Tank tank) {
        super.setTank(tank);
    }

    @Override
    public void increasePower() {
        System.out.println("wrrrrrrr");
    }
}
