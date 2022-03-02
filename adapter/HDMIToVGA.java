package adapter;

public class HDMIToVGA implements VGA {

    HDMI hdmi;

    public HDMIToVGA(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void plugVGA() {
        hdmi.plugHDMI();
        System.out.println("HDMI's red color to VGA's red color");
        System.out.println("HDMI's green color to VGA's green color");
        System.out.println("HDMI's blue color to VGA's blue color");
    }
}
