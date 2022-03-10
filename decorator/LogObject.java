package decorator;

public class LogObject extends DecoComponent {

    public LogObject(Component component) {
        super(component);
    }

    @Override
    public void printBill() {
        System.out.println("This is a log");
        getComponent().printBill();
    }
}
