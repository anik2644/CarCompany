package CarComponents.Tire;

public class SpareTire extends Tire {
    @Override
    public void rotate() {
        System.out.println("Spare tire rotating");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }

    @Override
    public void assemble() {

    }
}
