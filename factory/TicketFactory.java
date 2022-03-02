package factory;

import strategy.*;

public class TicketFactory {

    // Factory method
    public static BusTicket ticketFactory(String type) {
        switch (type) {
            case "XMonthly":
                return new XCompMonthlyTicket();
            case "XDaily":
                return new XCompDailyTicket();
            case "XStudent":
                return new XCompStudentMonthlyTicket();
            case "YMonthly":
                return new YCompMonthlyTicket();
            case "YDaily":
                return new YCompDailyTicket();
            case "YStudent":
                return new YCompStudentMonthlyTicket();
            default:
                return new BusTicket();
        }
    }
}
