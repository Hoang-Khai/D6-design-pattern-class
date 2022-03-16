package command;

public class LightOff implements Command {

    Light light = new Light();

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
