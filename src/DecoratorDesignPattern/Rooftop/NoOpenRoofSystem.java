package DecoratorDesignPattern.Rooftop;

public class NoOpenRoofSystem implements OpenRoofSystem {
    @Override
    public void operate() {
        System.out.println("Operating Open Roof System: No");
    }

    @Override
    public double getPrice() {
        return 200.0; // Example price for ThickRainShield
    }
}
