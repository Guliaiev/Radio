package ru.netologi.domain;

public class Radio {


    private int currentNumber;
    private int maxCurrentNumber = 9;
    private int minCurrentNumber = 0;

    private int currentVolume;
    private int maxCurrentVolume = 10;
    private int minCurrentVolume = 0;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber > maxCurrentNumber) {
            this.currentNumber = minCurrentNumber;
            return;
        }
        if (currentNumber < minCurrentNumber) {
            this.currentNumber = maxCurrentNumber;
            return;
        }
        this.currentNumber = currentNumber;
    }


    public int nextRadioNumber() {
        currentNumber = currentNumber >= maxCurrentNumber ? minCurrentNumber : ++currentNumber;
        return currentNumber;

    }

    public int prevRadioNumber() {
        currentNumber = currentNumber <= minCurrentNumber ? maxCurrentNumber : --currentNumber;
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxCurrentVolume) {
            this.currentVolume = maxCurrentVolume;
            return;
        }
        if (currentVolume < minCurrentNumber) {
            this.currentVolume = minCurrentVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void VolumeUp() {
        if (currentVolume == maxCurrentVolume)
            return;
        currentVolume++;
    }

    public void VolumeDown() {
        if (currentVolume == minCurrentVolume)
            return;
        currentVolume--;
    }
}


