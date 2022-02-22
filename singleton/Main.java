package singleton;

public class Main {
    public static void main(String... args) {
        AirConditionerController airConditionerController = AirConditionerController.getInstance();
        // Làm thế nào để cả hệ thống chỉ được tạo ra duy nhất 1 object thuộc loại đó!
        Member bauHM = new Member(airConditionerController);
        Member khaiNH = new Member(airConditionerController);

        bauHM.changeTemp(18);
        airConditionerController.display();
        khaiNH.changeTemp(29);
        airConditionerController.display();

        // Member tuanDM = new Member(new AirConditionerController());
        // tuanDM.changeTemp(25);
        // airConditionerController.display();
        // tuanDM.controller.display();
    }
}
