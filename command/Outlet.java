package command;

public class Outlet {
    Button onButton;
    Button offButton;

    public Outlet() {
        onButton = new Button();
        offButton = new Button();
    }

    public void plug(Command onCommand, Command offCommand) {
        onButton.setCommand(onCommand);
        offButton.setCommand(offCommand);
    }

    public Command pressButtonOn() {
        return onButton.pushedButton();
    }

    public void pressButtonOff() {
        offButton.pushedButton();
    }
}
