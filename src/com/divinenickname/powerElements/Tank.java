package com.divinenickname.powerElements;

public class Tank{
    /**
     * Max tank capacity, milliliters
     */
    private int maxCapacity;

    /**
     * Amount of fuel, milliliters
     */
    private int currentCapacity;

    /**
     *
     * @param maxCapacity Max tank capacity, milliliters
     * @param currentCapacity Amount of fuel, milliliters
     */
    public Tank(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
