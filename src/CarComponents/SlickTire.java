package CarComponents;

public class SlickTire implements Tire {
    @Override
    public void rotate() {
        System.out.println("Slick tires rotating");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
