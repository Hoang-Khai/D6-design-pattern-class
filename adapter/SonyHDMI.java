package adapter;

public class SonyHDMI implements HDMI {
    @Override
    public void plugHDMI() {
        System.out.println("Sony HDMI plugged");
    }
}
