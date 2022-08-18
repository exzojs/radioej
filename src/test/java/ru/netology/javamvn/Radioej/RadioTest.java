package ru.netology.javamvn.Radioej;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);
    @Test
    public void setStation() {
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(7);
        radio.nextStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        radio.setCurrentStation(8);
        radio.prevStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void nextStationIfThatMax() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationOnMin() {
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void nextStationAboveMax() {
        radio.setCurrentStation(10);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setStationAboveMax() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStationIfThatMin() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStationOnMax() {
        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void prevStationLessThanMin() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setStationLessThanMin() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void increaseVolumePlusOne() {
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        Assertions.assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumePlusOneIfItMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMinusOne() {
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        Assertions.assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMinusOneIfItMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setVolumeBelowMin() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    public void setVolumeAbowMax() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

}
