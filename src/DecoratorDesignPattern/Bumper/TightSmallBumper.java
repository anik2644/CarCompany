package DecoratorDesignPattern.Bumper;

import DecoratorDesignPattern.Bumper.Bumper;

public class TightSmallBumper implements Bumper {
    @Override
    public void attach() {
        System.out.println("Attaching Tight Small Bumper");
    }

    @Override
    public double getPrice() {
        return 200.0; // Example price for ThickRainShield
    }
}
