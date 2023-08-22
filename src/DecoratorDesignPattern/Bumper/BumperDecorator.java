package DecoratorDesignPattern.Bumper;

import DecoratorDesignPattern.Bumper.Bumper;
import DecoratorDesignPattern.Car;

public class BumperDecorator implements Car {
    private final Car car;
    private final Bumper bumper;

    public BumperDecorator(Car car, Bumper bumper) {
        this.car = car;
        this.bumper = bumper;
    }

    @Override
    public void assemble() {
        car.assemble();
        bumper.attach();
    }
}
