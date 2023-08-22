package CarComponents.Engine;

import CarComponents.Engine.Engine;

public class Engine2100CC implements Engine {
    @Override
    public void start() {
        System.out.println("2100CC Engine started");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
