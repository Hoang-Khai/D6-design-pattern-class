package strategy;

public class XCompMonthlyTicket extends BusTicket {
    public XCompMonthlyTicket() {
        calculator = new XCompMonthlyPrice();
    }
}
