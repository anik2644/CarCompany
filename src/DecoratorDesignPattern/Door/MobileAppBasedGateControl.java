package DecoratorDesignPattern.Door;

import DecoratorDesignPattern.Door.GateControllingSystem;

public class MobileAppBasedGateControl implements GateControllingSystem {


    @Override
    public void configure() {
        System.out.println("Configuring Mobile App-Based Gate Controlling System");
    }
    @Override
    public double getPrice() {
        return 200.0; // Example price for ThickRainShield
    }

}
