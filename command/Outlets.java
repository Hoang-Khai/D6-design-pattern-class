package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Outlets {
    List<Outlet> outlets = new ArrayList<>();

    Stack<Command> commands = new Stack<>();

    public Outlets() {
        outlets.add(new Outlet());
        outlets.add(new Outlet());
        outlets.add(new Outlet());
        outlets.add(new Outlet());
    }

    public void plug(int position, Command onCommand, Command offCommand) {
        outlets.get(position).plug(onCommand, offCommand);
    }

    public void pressButtonOn(int position) {
        Command recent = outlets.get(position).pressButtonOn();
        commands.push(recent);
    }

    public void pressButtonOff(int position) {
        outlets.get(position).pressButtonOff();
    }

    public void pressUndoButton() {
        commands.pop().undo();
    }
}
