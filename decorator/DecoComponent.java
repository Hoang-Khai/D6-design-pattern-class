package decorator;

public abstract class DecoComponent implements Component {
    private Component component;

    public DecoComponent(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    @Override
    public int getCost() {
        return getComponent().getCost();
    }

    @Override
    public void setCost(int cost) {
        getComponent().setCost(cost);
    }
}
