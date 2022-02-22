package strategy;

public class XCompPregnantMonthlyTicket extends BusTicket {
    public XCompPregnantMonthlyTicket() {
        calculator = new StudentPrice();
    }
}
