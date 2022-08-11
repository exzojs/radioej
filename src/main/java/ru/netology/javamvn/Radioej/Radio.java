package ru.netology.javamvn.Radioej;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int nextStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation >= 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        return currentStation;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0 && newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        }
        return currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
