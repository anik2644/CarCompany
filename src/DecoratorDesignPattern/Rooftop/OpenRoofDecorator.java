package DecoratorDesignPattern.Rooftop;

import DecoratorDesignPattern.Car;

public class OpenRoofDecorator implements Car {
    private final Car car;
    private final OpenRoofSystem openRoof;

    public OpenRoofDecorator(Car car, OpenRoofSystem openRoof) {
        this.car = car;
        this.openRoof = openRoof;
    }

    @Override
    public void assemble() {
        car.assemble();
        openRoof.operate();
    }
}
