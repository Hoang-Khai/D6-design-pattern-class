package decorator;

public class PrintReceipt extends DecoComponent {
    public PrintReceipt(Component component) {
        super(component);
    }

    @Override
    public void printBill() {
        Component component = getComponent();
        System.out.println(component.getCost());
        component.printBill();
    }
}
