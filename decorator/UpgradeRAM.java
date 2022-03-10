package decorator;

public class UpgradeRAM extends DecoComponent {
    public UpgradeRAM(Component component) {
        super(component);
    }

    @Override
    public void printBill() {
        Component component = getComponent();
        logicPlugRAM();
        component.setCost(component.getCost() + 100);
        component.printBill();
    }

    public void logicPlugRAM() {

    }
}
