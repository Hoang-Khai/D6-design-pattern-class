package adapter;

public interface HDMI {
    default void plugHDMI() {
        System.out.println("HDMI plugged");
    }
}
