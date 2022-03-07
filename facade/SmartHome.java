package facade;

public class SmartHome {
    public static void main(String... args) {
        String dvdName = "Truong Son Dong, Truong Son Tay";
        Light.addLight("LivingRoom");
        RelaxPreset relaxPreset = new RelaxPreset();
        relaxPreset.relax(dvdName, 30, 60, Integer.parseInt(args[0]));
        relaxPreset.backToNormal();
    }
}
