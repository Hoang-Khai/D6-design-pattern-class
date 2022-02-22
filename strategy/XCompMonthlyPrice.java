package strategy;

public class XCompMonthlyPrice implements CanCalculatePrice {
    @Override
    public int calculatePrice(int price) {
        return price * 25;
    }
}
