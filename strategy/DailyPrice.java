package strategy;

public class DailyPrice implements CanCalculatePrice { // Lớp hành vi
    @Override
    public int calculatePrice(int price) { // Xử lí cụ thể
        return price;
    }
}
// Các lớp hành vi thì có thể thay thế lẫn nhau thông qua đa hình