package strategy;

public class BusTicket {
    final int price = 100;
    CanCalculatePrice calculator = new DailyPrice(); // Đối tượng chuyên xử lí hành vi

    public void printInvoice() {
        System.out.println(calculatePrice()); 
    }

    public final int calculatePrice() {
        return calculator.calculatePrice(price);
    } // 25/26 vé sinh viên, 26/26 vé ngày
}
