package facade;

public class RelaxPreset {
    DVDPlayer dvdPlayer = new DVDPlayer();
    Light light = Light.lights.get("Bathroom");
    WaterHeater waterHeater = WaterHeater.WATER_HEATER;
    Bath bath = new Bath();

    public void relax(String dvdName, int brightness, int waterTemp, int waterLevel) {
        dvdPlayer.turnOn();
        dvdPlayer.play(dvdName);
        light.turnOn();
        light.dim(brightness);
        waterHeater.turnOn();
        waterHeater.setTemp(waterTemp);
        while (!waterHeater.isTempHighEnough()) {
            try {
                waterHeater.heating();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        while(!bath.isEnough(waterLevel)) {
            bath.openFaucet();
        }
    }

    public void backToNormal() {
        dvdPlayer.turnOff();
        light.turnOn();
        light.dim(100);
        waterHeater.turnOff();
        bath.closeFaucet();
        bath.flush();
    }
}
