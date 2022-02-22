package singleton;

public class AirConditionerController {
    private static AirConditionerController controller;

    int temperature = 16;

    private AirConditionerController() {
    }

    public static AirConditionerController getInstance() {
        if (controller == null) {
            controller = new AirConditionerController();
        }
        return controller;
    }

    public void display() {
        System.out.println("Current temp: " + temperature);
    }
}
