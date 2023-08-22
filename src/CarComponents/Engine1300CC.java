package CarComponents;

public class Engine1300CC implements Engine {
    @Override
    public void start() {
        System.out.println("1300CC Engine started");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
