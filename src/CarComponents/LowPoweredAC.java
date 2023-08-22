package CarComponents;

public class LowPoweredAC implements AC {
    @Override
    public void cooling() {
        System.out.println("Low-powered AC cooling");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}

// Color enum for available colors