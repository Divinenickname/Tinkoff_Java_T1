package com.divinenickname.engines;

import com.divinenickname.powerElements.Accumulator;

public class ElectricEngine extends Engine implements IIncreasePower, IDecreasePower, IEngine {
    private int power;
    private int maxPower;
    private Accumulator accumulator;

    /**
     *
     * @param maxPower max power of engine
     */
    public ElectricEngine(int maxPower){
        this.maxPower = maxPower;
    }

    public void setAccumulator(Accumulator accumulator){
        this.accumulator = accumulator;
    }


    @Override
    public void increasePower() {
        if(power<maxPower){
            power++;
            accumulator.setCurrentCapacity(accumulator.getCurrentCapacity()-15);
            System.out.println("Awwww...");
        }
        else {
            System.out.println("It's max power");
        }

    }

    public void decreasePower(){
        if(power>0){
            power--;
            System.out.println("Wuuuuu....");
        }
        else{
            System.out.println("You already stopped");
        }

    }

    public int getPower(){
        return this.power;
    }

    @Override
    public void startEngine() {
        if(super.isEnabled() || accumulator.getCurrentCapacity()==0){
            System.out.println("Nothing happens");
        } else{
            System.out.println("Engine has been started");
            super.setEnabled(true);
        }
    }

    @Override
    public void stopEngine() {
        if(!super.isEnabled()){
            System.out.println("Nothing happens");
        } else{
            System.out.println("Engine has been stopped");
            super.setEnabled(false);
        }
    }
}
