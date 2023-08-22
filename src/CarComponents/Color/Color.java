package CarComponents.Color;

import CarComponents.CarComponent;

public enum Color implements CarComponent {
    RED(200.0),
    WHITE(250.0),
    GREY(220.0),
    BLACK(230.0);

    private final double price;

    Color(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void assemble() {

    }
}
