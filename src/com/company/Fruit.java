package com.company;

public class Fruit extends Food {
    private boolean isReadyToEat = true;

    public Fruit() {
        this.isReadyToEat = false;
    }

    public Fruit(boolean isReadyToEat) {
        this.isReadyToEat = isReadyToEat;
    }

    public Fruit(String name, double kg, boolean isReadyToEat) {
        super(name, kg);
        this.isReadyToEat = isReadyToEat;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "isReadyToEat=" + isReadyToEat +
                '}';
    }

    public boolean isReadyToEat() {
        return isReadyToEat;
    }

    public void setReadyToEat(boolean readyToEat) {
        isReadyToEat = readyToEat;
    }
}
