package state;

public class Main {
    public static void main(String... args) {
        Member khai = new Member();
        Form form = new Form();
        khai.form = form;
        khai.form.approve();
        khai.form.createForm();
        
        Member minh = new Member();
        minh.form = form;
        minh.form.approve();
        // System.out.println(minh.form.state);

        Member bau = new Member();
        bau.form = form;
        bau.form.approve();
        // System.out.println(bau.form.state);
    }
}
