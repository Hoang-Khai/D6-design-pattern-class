package strategy;

public class YCompMonthlyTicket extends BusTicket {
    public YCompMonthlyTicket() {
        calculator = new YCompMonthlyPrice();
    }
}
