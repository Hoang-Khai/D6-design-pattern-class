package adapter;

public class Main {
    public static void main(String... args) {
        HDMI itHDMI = new SamsungHDMI();
        SonyMonitor ducMonitor = new SonyMonitor();
        ducMonitor.project(new HDMIToVGA(itHDMI)); // Encapsulate đối tượng gốc thành đối tượng mới và dùng đối tượng mới như cái interface mà mình cần
    }

    
}
