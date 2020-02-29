package com.divinenickname.powerElements;

public abstract class Accumulator implements ICharge{
    /**
     * Max capacity of accumulator, milli-ampere hour
     */
    private int maxCapacity;

    /**
     * Current capacity of accumulator, milli-ampere hour
     */
    private int currentCapacity;

    /**
     * Weight of accumulator, kilogram
     */
    private int weight;
    /**
     * Voltage of accumulator, millivolt
     */
    private int voltage;
    /**
     * Maximum battery life, year
     */
    private int lifeTime;

    /**
     *
     * @param maxCapacity ampere hour
     * @param weight kilogram
     * @param voltage volt
     * @param lifeTime year
     */
    public Accumulator(int maxCapacity, int weight, int voltage, int lifeTime, int defaultCapacity) {
        this.maxCapacity = maxCapacity;
        this.weight = weight;
        this.voltage = voltage;
        this.lifeTime = lifeTime;
        this.currentCapacity = defaultCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }
}
