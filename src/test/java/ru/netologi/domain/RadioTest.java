package ru.netologi.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void controlMaxStation() {
        radio.setCurrentNumber(10);
        assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void controlMinStation() {
        radio.setCurrentNumber(-1);
        assertEquals(9, radio.getCurrentNumber());
    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentNumber(3);
        radio.nextRadioNumber();
        assertEquals(4, radio.getCurrentNumber());
    }

    @Test
    public void nextStationAfterFinal() {
        radio.setCurrentNumber(9);
        radio.nextRadioNumber();
        assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void prevStationAfterStart() {
        radio.setCurrentNumber(0);
        radio.prevRadioNumber();
        assertEquals(9, radio.getCurrentNumber());
    }

    @Test
    public void controlNumberStation() {
        radio.setCurrentNumber(8);
        assertEquals(8, radio.getCurrentNumber());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentNumber(6);
        radio.prevRadioNumber();
        assertEquals(5, radio.getCurrentNumber());
    }

    @Test
    public void volumeUnderMin() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeOverMax() {
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void volumeDownControl() {
        radio.setCurrentVolume(0);
        radio.VolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void VolumeUpControl() {
        radio.setCurrentVolume(10);
        radio.VolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void volumeMustDown() {
        radio.setCurrentVolume(5);
        radio.VolumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void volumeMustUp() {
        radio.setCurrentVolume(2);
        radio.VolumeUp();
        assertEquals(3, radio.getCurrentVolume());
    }
}
