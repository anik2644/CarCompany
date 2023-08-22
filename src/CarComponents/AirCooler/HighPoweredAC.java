package CarComponents.AirCooler;

import CarComponents.AirCooler.AC;

public class HighPoweredAC extends AC {
    @Override
    public void cooling() {
        System.out.println("High-powered AC cooling");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }

    @Override
    public void assemble() {

    }
}
