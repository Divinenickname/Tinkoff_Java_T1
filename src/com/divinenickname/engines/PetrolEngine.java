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
        Runnable runnable = () -> {
            if(tank.getCurrentCapacity()>0){
                isEnabled = true;
            }

            while (tank.getCurrentCapacity()>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tank.setCurrentCapacity(tank.getCurrentCapacity() - BASE_FUEL_CONSUMPTION);
            }

            stopEngine();
        };
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped!");
    }

    @Override
    public void increasePower() {

    }
}
