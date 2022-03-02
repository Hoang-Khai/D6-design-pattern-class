package strategy;

public class YCompStudentMonthlyTicket extends BusTicket {
    public YCompStudentMonthlyTicket() {
        calculator = new StudentPrice(); // Tuỳ vào đối tượng bao chứa mà quyết định dùng hành vi nào cho phù hợp
    }
}
