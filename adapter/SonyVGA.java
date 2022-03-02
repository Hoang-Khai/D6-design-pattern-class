package adapter;

public class SonyVGA implements VGA {
    @Override
    public void plugVGA() {
        System.out.println("Sony VGA plugged");
    }
}
