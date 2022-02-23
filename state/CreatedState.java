package state;

public class CreatedState implements StateInterface {

    Form form;

    public CreatedState(Form form) {
        this.form = form;
    }

    @Override
    public void approve() {
        System.out.println("PM approved");
        form.state = new PMApprovedState(form);
    }

    @Override
    public void editForm() {
        // TODO Auto-generated method stub
        System.out.println("Form edited");
        form.state = new SubmitedState(form);
    }

    @Override
    public void reject() {
        System.out.println("PM reject");
        form.state = new CreatedState(form);
    }
}
