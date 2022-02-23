package state;

public class Form { // đơn đăng kí OT
    StateInterface state = new NotCreatedState(this);

    //State pattern

    public void createForm() {
        state.createForm();
    }

    public void editForm() {
        state.editForm();
    }

    public void approve() {
        state.approve();
    }

    public void reject() {
        state.reject();
    }
}