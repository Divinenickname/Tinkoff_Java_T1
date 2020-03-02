package com.divinenickname.engines;

import com.divinenickname.powerElements.Tank;

public abstract class FuelEngine extends Engine {
    private Tank tank;

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void startEngine() {
        if(super.isEnabled() || getTank().getCurrentCapacity()==0){
            System.out.println("Nothing happens");
        } else{
            System.out.println("Engine has been started");
            super.setEnabled(true);
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped!");
    }
}
