package adapter;

public class SamsungHDMI implements HDMI {
    @Override
    public void plugHDMI() {
        System.out.println("Samsung HDMI plugged");
    }
}
