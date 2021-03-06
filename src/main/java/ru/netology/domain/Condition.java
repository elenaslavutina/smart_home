package ru.netology.domain;

public class Condition {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature)
            return;
        if (currentTemperature < minTemperature)
            return;

        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {

        if ((currentTemperature + 1) > maxTemperature)
            return;

        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {

        if ((currentTemperature - 1) < minTemperature)
            return;
        currentTemperature--;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
