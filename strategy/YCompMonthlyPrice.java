package strategy;

public class YCompMonthlyPrice implements CanCalculatePrice {
    @Override
    public int calculatePrice(int price) {
        // TODO Auto-generated method stub
        return price * 26;
    }
}
