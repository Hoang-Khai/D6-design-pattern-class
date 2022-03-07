package facade;

import java.util.HashMap;
import java.util.Map;

public class Light {

    public static final Map<String, Light> lights = new HashMap<>();

    private Light() {
        lights.put("Bathroom", new Light());
    }

    public static void addLight(String position) {
        lights.put(position, new Light());
    }

    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }

    public void dim(int percentage) {
        System.out.println("Light is dimmed to: " + percentage);
    }
}
