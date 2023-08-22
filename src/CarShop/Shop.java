package CarShop;

public class Shop {
    private String name;
    private String location;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Shop Name: " + name);
        System.out.println("Location: " + location);
    }
}

