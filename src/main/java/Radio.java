public class Radio {

    private int currentVolume;
    private int currentStation;
    private int numberOfStations = 10;
    private  int maxStation = numberOfStations -1;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = numberOfStations -1;
    }

    public Radio() {
        this.numberOfStations = numberOfStations;
        this.maxStation = numberOfStations -1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else currentStation += 1;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else currentStation -= 1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}

