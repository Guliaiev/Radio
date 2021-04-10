package ru.netologi.domain;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Radio {


    private int currentNumber = 5;
    private int maxCurrentNumber = 10;
    private int minCurrentNumber = 0;
    private int currentVolume = 5;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;


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



