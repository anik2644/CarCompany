package CarComponents;

public class Engine1800CC implements Engine {
    @Override
    public void start() {
        System.out.println("1800CC Engine started");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
