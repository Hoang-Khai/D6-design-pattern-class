package command;

public class Main {
    public static void main(String... args) {
        Light livingRoomLight = new Light();
        LightOff livingLightOff = new LightOff();
        livingLightOff.setLight(livingRoomLight);
        LightOn livingLightOn = new LightOn();
        livingLightOn.setLight(livingRoomLight);
        Outlets outlets = new Outlets();
        outlets.plug(1, livingLightOn, livingLightOff);
        outlets.pressButtonOn(1);
        outlets.pressButtonOff(1);
    }
}
