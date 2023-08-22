package CarComponents;

public class Engine1700CC implements Engine {
    @Override
    public void start() {
        System.out.println("1700CC Engine started");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
