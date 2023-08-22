package DecoratorDesignPattern.Rooftop;

import DecoratorDesignPattern.Rooftop.OpenRoofSystem;

public class YesOpenRoofSystem implements OpenRoofSystem {
    @Override
    public void operate() {
        System.out.println("Operating Open Roof System: Yes");
    }

    @Override
    public double getPrice() {
        return 200.0; // Example price for ThickRainShield
    }

}
