package DecoratorDesignPattern.RainSheild;

import DecoratorDesignPattern.Car;
import DecoratorDesignPattern.RainSheild.RainShield;

public class RainShieldDecorator implements Car {
    private final Car car;
    private final RainShield rainShield;

    public RainShieldDecorator(Car car, RainShield rainShield) {
        this.car = car;
        this.rainShield = rainShield;
    }

    @Override
    public void assemble() {
        car.assemble();
        rainShield.install();
    }
}

