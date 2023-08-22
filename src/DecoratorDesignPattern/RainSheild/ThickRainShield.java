package DecoratorDesignPattern.RainSheild;

import DecoratorDesignPattern.RainSheild.RainShield;

public class ThickRainShield implements RainShield {
    @Override
    public void install() {
        System.out.println("Installing Thick Rain Shield");
    }

    @Override
    public double getPrice() {
        return 200.0; // Example price for ThickRainShield
    }
}
