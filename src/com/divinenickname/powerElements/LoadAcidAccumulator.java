package com.divinenickname.powerElements;

public class LoadAcidAccumulator extends Accumulator {
    /**
     * @param maxCapacity ampere hour
     * @param weight      kilogram
     * @param voltage     volt
     * @param lifeTime    year
     */
    public LoadAcidAccumulator(int maxCapacity, int weight, int voltage, int lifeTime, int defaultCapacity) {
        super(maxCapacity, weight, voltage, lifeTime, defaultCapacity);
    }

    public void startCharging() {
        while(getCurrentCapacity() < getMaxCapacity() - getMaxCapacity()*0.02){
            if(getCurrentCapacity()<getMaxCapacity()*0.3){
                setCurrentCapacity(getCurrentCapacity() + 25);
            }
            else if(getCurrentCapacity()<getMaxCapacity()*0.7){
                setCurrentCapacity(getCurrentCapacity()+50);
            }
            else{
                setCurrentCapacity(getCurrentCapacity()+3);
            }

            System.out.println(getCurrentCapacity());

        }

        System.out.println("Charged!");
    }
}
