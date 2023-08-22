package DecoratorDesignPattern.Bumper;

import DecoratorDesignPattern.Bumper.Bumper;

public class LoosenBigBumper implements Bumper {
    @Override
    public void attach() {
        System.out.println("Attaching Loosen Big Bumper");
    }

    @Override
    public double getPrice() {
        return 200.0; // Example price for ThickRainShield
    }
}
