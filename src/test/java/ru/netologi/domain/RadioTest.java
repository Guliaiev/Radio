package ru.netologi.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(5, 10, 0, 5, 100, 0);

    @Test
    void shouldUseMaxStationConstructor() {
        assertEquals(10, radio.getMaxCurrentNumber());
    }

    @Test
    void shouldUseNoArgsConstructor() {
        Radio radio = new Radio(5, 10, 0, 5, 100, 0);
        assertEquals(10, radio.getMaxCurrentNumber());
        assertEquals(0, radio.getMinCurrentNumber());
        assertEquals(5, radio.getCurrentNumber());
        assertEquals(100, radio.getMaxCurrentVolume());
        assertEquals(0, radio.getMinCurrentVolume());
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentNumber() {
        radio.increaseCurrentNumber();
        assertEquals(0, radio.getMinCurrentNumber());
    }

    @Test
    void decreaseCurrentNumber() {
        radio.decreaseCurrentNumber();
        assertEquals(4, radio.getCurrentNumber());
    }

    @Test
    void increaseMaxCurrentNumber() {
        radio.setCurrentNumber(10);
        radio.increaseCurrentNumber();
        assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    void decreaseMinCurrentNumber() {
        radio.setCurrentNumber(0);
        radio.decreaseCurrentNumber();
        assertEquals(10, radio.getCurrentNumber());
    }

    @Test
    void minCurrentNumber() {
        radio.setCurrentNumber(-1);
        assertEquals(10, radio.getCurrentNumber());
    }

    @Test
    void maxCurrentNumber() {
        radio.setCurrentNumber(11);
        assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    void increaseCurrentVolume() {
        radio.setCurrentVolume(80);
        radio.increaseCurrentVolume();
        assertEquals(0, radio.getMinCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void minCurrentVolume() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void maxCurrentVolume() {
        radio.setCurrentVolume(120);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseMaxCurrentVolume() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseMinCurrentVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
