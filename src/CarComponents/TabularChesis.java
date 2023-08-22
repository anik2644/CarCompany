package CarComponents;

public class TabularChesis implements Chesis {
    @Override
    public void type() {
        System.out.println("Tabular chesis");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
