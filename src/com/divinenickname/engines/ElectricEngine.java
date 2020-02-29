package com.divinenickname.engines;

import com.divinenickname.powerElements.Accumulator;

public class ElectricEngine implements IIncreasePower, IDecreasePower, IEngine {
    private int power;
    private int maxPower;
    private Accumulator accumulator;
    private boolean isEnabled;

    /**
     *
     * @param maxPower max power of engine
     */
    public ElectricEngine(int maxPower, Accumulator accumulator){
        this.maxPower = maxPower;
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
        if(!isEnabled && accumulator.getCurrentCapacity()>0){
            System.out.println("Nothing happens");
        } else{
            System.out.println("Engine has been started");
            isEnabled = true;
        }
    }

    @Override
    public void stopEngine() {
        if(!isEnabled){
            System.out.println("Nothing happens");
        } else{
            System.out.println("Engine has been stopped");
            isEnabled = false;
        }
    }
}
