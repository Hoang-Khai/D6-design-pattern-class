package state;

public class SubmitedState implements StateInterface {
    Form form;

    public SubmitedState(Form form) {
        this.form = form;
    }
}
