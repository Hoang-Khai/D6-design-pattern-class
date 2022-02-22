package strategy;

public class Main {
    public static void main(String... args) {
        // Làm sao để thuật toán nó có thể thay đổi tuỳ theo runtime / kiểu dữ liệu mà vẫn có thể tái sử dụng hiệu quả
        BusTicket forA = new XCompDailyTicket();
        forA.printInvoice();
        BusTicket forB = new XCompMonthlyTicket();
        forB.printInvoice();
        BusTicket forC = new XCompStudentMonthlyTicket();
        forC.printInvoice(); 
    }
}
