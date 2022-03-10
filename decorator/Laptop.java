package decorator;

public class Laptop implements Component {
    private int cost = 1000;

    public void printBill() {
        System.out.println("Paid: " + cost);
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }
    
}
