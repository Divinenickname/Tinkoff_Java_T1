package com.divinenickname.wheels;

public class Wheel {
    /**
     * Rim diameter, inches
     */
    private int size;

    /**
     * Brand name e.g. Pirelli
     */
    private String brand;

    /**
     * Tube or tubeless
     */
    private boolean isTubeless;

    /**
     * Model of wheel
     */
    private String model;

    /**
     * Aspect ratio
     */
    private int height;

    /**
     * Tread width, millimeters
     */
    private int width;
    private Bolt[] bolts;

    public Wheel(int size, String brand, boolean isTubeless, String model, int height, int width, int boltCount, int boltSize) {
        this.size = size;
        this.brand = brand;
        this.isTubeless = isTubeless;
        this.model = model;
        this.height = height;
        this.width = width;
        bolts = new Bolt[boltCount];
        for (int i = 0; i < boltCount; i++) {
            bolts[i] = new Bolt(boltSize);
        }
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isTubeless() {
        return isTubeless;
    }

    public String getModel() {
        return model;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    class Bolt{
        private int size;
        Bolt(int size) {
            this.size = size;
        }
    }
}
