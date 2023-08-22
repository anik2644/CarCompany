package CarComponents.Tire;

public class SnowTire extends Tire {
    @Override
    public void rotate() {
        System.out.println("Snow tires rotating");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }

    @Override
    public void assemble() {

    }
}
