package adapter;

public class SamsungVGA implements VGA {
    @Override
    public void plugVGA() {
        System.out.println("Samsung VGA plugged");
    }
}
