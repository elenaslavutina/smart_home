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

    //   public void setMaxVolume(int maxVolume) {
    //       this.maxVolume = maxVolume;
    //   }

    public int getMinVolume() {
        return minVolume;
    }

//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }

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

    //  public void setMaxChanel(int maxChanel) {
    //      this.maxChanel = maxChanel;
    //  }

    public int getMinChanel() {
        return minChanel;
    }

    //   public void setMinChanel(int minChanel) {
    //       this.minChanel = minChanel;
    //   }

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

        if (currentChanel == maxChanel)
        {
            currentChanel = minChanel;}
        else
            currentChanel++;
        this.currentChanel = currentChanel;
    }

    public void decreaseCurrentChanelByArrow(int currentChanel) {

        if (currentChanel == minChanel)
        {
            currentChanel = maxChanel;}
        else
            currentChanel--;
        this.currentChanel = currentChanel;
    }

    public void increaseCurrentVolumeByArrow(int currentVolume) {

        if (currentVolume == maxVolume)
            return;
        currentVolume++;
        this.currentVolume = currentVolume;
    }

    public void decreaseCurrentVolumeByArrow(int currentVolume) {

        if (currentVolume == minVolume)
            return;
        currentVolume--;
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
