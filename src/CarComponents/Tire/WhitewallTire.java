package CarComponents.Tire;

import CarComponents.Tire.Tire;

public class WhitewallTire implements Tire {
    @Override
    public void rotate() {
        System.out.println("Whitewall tires rotating");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
