package DecoratorDesignPattern.Door;

import DecoratorDesignPattern.Car;

public class GateControlDecorator implements Car {
    private final Car car;
    private final GateControllingSystem gateControl;

    public GateControlDecorator(Car car, GateControllingSystem gateControl) {
        this.car = car;
        this.gateControl = gateControl;
    }

    @Override
    public void assemble() {
        car.assemble();
        gateControl.configure();
    }
}
