package CarShop;

public class AsiaShop extends Shop {
    public AsiaShop(String name, String location) {
        super(name, location);
    }

    public void displayAsiaInfo() {
        System.out.println("Asia-Centric Shop Information:");
        displayInfo();
        System.out.println("Selling Asia-Centric Car Models");
    }
}
