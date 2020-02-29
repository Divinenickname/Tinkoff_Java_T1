package com.divinenickname.engines;

public class Engine implements IEngine {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public void startEngine() {
        if(!isEnabled){
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
