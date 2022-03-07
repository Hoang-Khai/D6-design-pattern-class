package facade;

public class Bath {
    private int level = 0;

    public void openFaucet() {
        System.out.println("Faucet opened");
        level += 10;
    }

    public void closeFaucet() {
        System.out.println("Faucet closed");
    }

    public boolean isEnough(int desiredLevel) {
        return level >= desiredLevel;
    }

    public void flush() {
        System.out.println("Flushed");
        level = 0;
    }
}
