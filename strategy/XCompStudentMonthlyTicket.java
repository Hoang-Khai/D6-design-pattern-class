package strategy;

public class XCompStudentMonthlyTicket extends BusTicket {
    public XCompStudentMonthlyTicket() {
        calculator = new StudentPrice(); // Tuỳ vào đối tượng bao chứa mà quyết định dùng hành vi nào cho phù hợp
    }
}
