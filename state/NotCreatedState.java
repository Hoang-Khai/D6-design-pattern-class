package state;

public class NotCreatedState implements StateInterface {

    Form form;

    public NotCreatedState(Form form) {
        this.form = form;
    }

    @Override
    public void createForm() {
        System.out.println("Form created");
        form.state = new CreatedState(form);
    }
}
