package CarShop;

public class USAShop extends Shop {
    public USAShop(String name, String location) {
        super(name, location);
    }

    public void displayUSAInfo() {
        System.out.println("USA-Centric Shop Information:");
        displayInfo();
        System.out.println("Selling USA-Centric Car Models");
    }
}
