package strategy;

public class StudentPrice implements CanCalculatePrice {
    @Override
    public int calculatePrice(int price) {
        return price * 20;
    }

    // Student + Khuyết tật + Phụ nữ mang thai
}
