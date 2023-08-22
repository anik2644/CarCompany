package CarComponents.Tire;

import CarComponents.CarComponent;

// Tire interface and its implementations
public abstract class Tire implements CarComponent {
    abstract void rotate();
    abstract double getPrice();
}

