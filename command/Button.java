package command;

public class Button {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command pushedButton() {
        command.execute();
        return command;
    }
}
