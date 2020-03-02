package com.divinenickname.speedometers;

/**
 * Dummy class for displaying current speed.
 */
public abstract class Speedometer {
    private int currentSpeed;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
