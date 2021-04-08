package ru.netologi.domain;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@NoArgsConstructor

@AllArgsConstructor
public class Radio {


    private int currentNumber = 5;
    private int maxCurrentNumber = 10;
    private int minCurrentNumber = 0;
    private int currentVolume = 5;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;

    public void setMaxCurrentNumber(int maxCurrentNumber) {
        this.maxCurrentNumber = maxCurrentNumber;
    }

    public void setMinCurrentNumber(int minCurrentNumber) {
        this.minCurrentNumber = minCurrentNumber;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;
    }

    public void increaseCurrentNumber() {
        if (currentNumber >= maxCurrentNumber) {
            currentNumber = minCurrentNumber;
            return;
        }
        currentNumber++;
    }

    public void decreaseCurrentNumber() {
        if (currentNumber <= minCurrentNumber) {
            currentNumber = maxCurrentNumber;
            return;
        }
        currentNumber--;
    }

    public void increaseCurrentVolume() {
        if (currentVolume == maxCurrentVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minCurrentVolume) {
            return;
        }
        currentVolume--;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }


    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }


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

    public int getMinCurrentNumber() {
        return minCurrentNumber;
    }

    public int getMaxCurrentNumber() {
        return maxCurrentNumber;
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
}



