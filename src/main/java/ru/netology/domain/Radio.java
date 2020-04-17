package ru.netology.domain;

public class Radio {
    private String name;
    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentChanel;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;


    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxChanel() {
        return maxChanel;
    }

    public int getMinChanel() {
        return minChanel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < minChanel)
            return;
        if (currentChanel > maxChanel)
            return;
        this.currentChanel = currentChanel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume)
            return;
        if (currentVolume > maxVolume)
            return;
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentChanelByArrow(int currentChanel) {

        if (currentChanel == maxChanel) {
            this.currentChanel = minChanel;
        } else
            this.currentChanel = currentChanel + 1;
    }

    public void decreaseCurrentChanelByArrow(int currentChanel) {

        if (currentChanel == minChanel) {
            this.currentChanel = maxChanel;
        } else
            this.currentChanel = currentChanel - 1;
    }

    public void increaseCurrentVolumeByArrow(int currentVolume) {

        if (currentVolume == maxVolume)
            return;
        this.currentVolume = currentVolume + 1;
    }

    public void decreaseCurrentVolumeByArrow(int currentVolume) {

        if (currentVolume == minVolume)
            return;
        this.currentVolume = currentVolume - 1;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
