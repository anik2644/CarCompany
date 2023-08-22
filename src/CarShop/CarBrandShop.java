package CarShop;

import java.util.ArrayList;
import java.util.List;

public class CarBrandShop {
    private String name;
    private String bodyDesign;
    private List<Shop> shops = new ArrayList<>();

    public CarBrandShop(String name, String bodyDesign) {
        this.name = name;
        this.bodyDesign = bodyDesign;
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public void displayInfo() {
        System.out.println("Car Group: " + name);
        System.out.println("Body Design: " + bodyDesign);
    }

    public void displayShopsInfo() {
        displayInfo();
        System.out.println("Shops:");
        for (Shop shop : shops) {
            shop.displayInfo();
        }
    }
}
