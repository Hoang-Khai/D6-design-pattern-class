package state;

public class PMApprovedState implements StateInterface {
    Form form;

    public PMApprovedState(Form form) {
        this.form = form;
    }

    @Override
    public void approve() {
        System.out.println("DLead approved");
        form.state = new DLeadApproveState(form);
    }

    @Override
    public void reject() {
        System.out.println("DLead rejected");
        form.state = new CreatedState(form);
    }
}
