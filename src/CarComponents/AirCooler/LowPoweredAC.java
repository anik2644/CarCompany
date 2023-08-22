package CarComponents.AirCooler;

import CarComponents.AirCooler.AC;

public class LowPoweredAC extends AC {
    @Override
    public void cooling() {
        System.out.println("Low-powered AC cooling");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }

    @Override
    public void assemble() {

    }
}

// Color enum for available colors