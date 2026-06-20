package airConditioner;

public class AirConditioner {
    private boolean isOn;
    private int temperaure;

    public boolean checkState(){
        return isOn;
    }


    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseTemperature() {
        if(temperaure < 30)temperaure = temperaure + 1;
    }

    public int getTemperature() {
        return temperaure;
    }

    public void decreaseTemperature() {
        if(temperaure > 16)temperaure = temperaure - 1;
    }
}
