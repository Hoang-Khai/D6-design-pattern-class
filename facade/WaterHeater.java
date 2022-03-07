package facade;

import java.util.Random;

public class WaterHeater {
    public static final WaterHeater WATER_HEATER = new WaterHeater();

    private WaterHeater() {
    }

    public void turnOn() {
        System.out.println("Water heater is on");
    }

    public void turnOff() {
        System.out.println("Water heater is off");
    }

    public void setTemp(int temp) {
        System.out.println("The water temp is now set to: " + temp);
    }

    public boolean isTempHighEnough() {
        return (new Random()).nextInt(2) > 0;
    }

    public void heating() {
        System.out.println("Heating");
    }
}
