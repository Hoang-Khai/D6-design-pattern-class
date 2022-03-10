package decorator;

public class Main {
    public static void main(String... args) {
        Component laptop1 = new Laptop();
        // Component logLaptop = new LogObject(laptop1);
        Component printReceptLaptop = new PrintReceipt(laptop1);
        Component laptopWithUpgradeRam = new UpgradeRAM(printReceptLaptop);
        Component laptopWithUpgradeSSD = new UpgradeSSD(laptopWithUpgradeRam);
        laptopWithUpgradeSSD.printBill();
    }
}
