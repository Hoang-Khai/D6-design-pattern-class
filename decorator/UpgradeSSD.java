package decorator;

public class UpgradeSSD extends DecoComponent {
    public UpgradeSSD(Component component) {
        super(component);
    }

    @Override
    public void printBill() {
        Component component = getComponent();
        component.setCost(component.getCost() + 300);
        component.printBill();
    }
}
