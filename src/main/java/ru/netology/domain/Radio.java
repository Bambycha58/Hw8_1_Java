package ru.netology.domain;

public class Radio {
    private int minWave = 0;
    private int maxWave = 9;
    private int currentWave;
    private int minVolumeLevel = 0;
    private int maxVolumeLevel = 10;
    private int currentVolumeLevel;

    public void setCurrentWave(int currentWave) {
        if (currentWave > maxWave || currentWave < minWave) {
            return;
        }
        this.currentWave = currentWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int next() {
        if (currentWave < maxWave) {
            currentWave += 1;
        } else {
            currentWave = minWave;
        }
        return currentWave;

    }

    public int previous() {
        if (currentWave > minWave) {
            currentWave -= 1;
        } else {
            currentWave = maxWave;
        }
        return currentWave;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel > maxVolumeLevel || currentVolumeLevel < minVolumeLevel) {
            return;
        }
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public int getCurrentVolume() {
        return currentVolumeLevel;
    }

    public int plusVolume() {
        if (currentVolumeLevel < maxVolumeLevel) {
            currentVolumeLevel += 1;
        } else {
            System.out.println("Предел громкости достигнут" + " " + currentVolumeLevel);
        }
        return currentVolumeLevel;
    }

    public int minusVolume() {
        if (currentVolumeLevel > minVolumeLevel) {
            currentVolumeLevel -= 1;
        } else {
            System.out.println("Нельзя уменьшить громкость" + " " + currentVolumeLevel);
            ;
        }
        return currentVolumeLevel;
    }

}
