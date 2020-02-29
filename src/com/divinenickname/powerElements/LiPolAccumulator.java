package com.divinenickname.powerElements;

public class LiPolAccumulator extends Accumulator {
    /**
     * @param capacity ampere hour
     * @param weight   kilogram
     * @param voltage  volt
     * @param lifeTime year
     */
    public LiPolAccumulator(int capacity, int weight, int voltage, int lifeTime, int defaultCapacity) {
        super(capacity, weight, voltage, lifeTime, defaultCapacity);
    }

    @Override
    public void startCharging() {

        while(getCurrentCapacity() < getMaxCapacity() - getMaxCapacity()*0.05){
            if(getCurrentCapacity()<getMaxCapacity()*0.6){
                setCurrentCapacity(getCurrentCapacity() + 100);
            }
            else{
                setCurrentCapacity(getCurrentCapacity()+1);
            }

            System.out.println(getCurrentCapacity());

        }

        System.out.println("Charged!");

    }
}
