package singleton;

public class Member {
    AirConditionerController controller;

    public Member(AirConditionerController controller) {
        this.controller = controller;
    }

    public void changeTemp(int temp) {
        controller.temperature = temp;
    }
}
