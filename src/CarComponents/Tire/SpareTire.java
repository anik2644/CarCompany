package CarComponents.Tire;

public class SpareTire implements Tire {
    @Override
    public void rotate() {
        System.out.println("Spare tire rotating");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
