package CarComponents;

public class HighPoweredAC implements AC {
    @Override
    public void cooling() {
        System.out.println("High-powered AC cooling");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
