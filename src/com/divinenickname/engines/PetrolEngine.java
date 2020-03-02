package com.divinenickname.engines;


import com.divinenickname.powerElements.Tank;

public class PetrolEngine implements IEngine, IIncreasePower{
    private Tank tank;
    private boolean isEnabled;

    /**
     * Basic fuel consumption without any load, milliliters
     */
    final int BASE_FUEL_CONSUMPTION = 800;

    public PetrolEngine(Tank tank) {
        this.tank = tank;
    }



    @Override
    public void startEngine() {
        if(isEnabled || tank.getCurrentCapacity()==0){
            System.out.println("Nothing happens");
        } else{
            System.out.println("Engine has been started");
            isEnabled = true;
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped!");
    }

    @Override
    public void increasePower() {

    }
}
