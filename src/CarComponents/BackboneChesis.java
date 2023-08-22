package CarComponents;

public class BackboneChesis implements Chesis {
    @Override
    public void type() {
        System.out.println("Backbone chesis");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
