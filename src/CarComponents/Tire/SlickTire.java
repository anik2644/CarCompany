package CarComponents.Tire;

public class SlickTire extends Tire {
    @Override
    public void rotate() {
        System.out.println("Slick tires rotating");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }

    @Override
    public void assemble() {

    }
}
