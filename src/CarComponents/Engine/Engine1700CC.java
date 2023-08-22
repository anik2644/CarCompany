package CarComponents.Engine;

import CarComponents.Engine.Engine;

public class Engine1700CC extends Engine {
    @Override
    public void start() {
        System.out.println("1700CC Engine started");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }

    @Override
    public void assemble() {

    }
}
