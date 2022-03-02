package strategy;

import factory.TicketFactory;

public class Main {
    public static void main(String... args) {
        BusTicket x = TicketFactory.ticketFactory(args[0]);
        x.printInvoice();
    }
}
