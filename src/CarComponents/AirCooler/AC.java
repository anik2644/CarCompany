package CarComponents.AirCooler;

import CarComponents.CarComponent;

// AC interface and its implementations
public abstract class AC implements CarComponent {
   abstract void cooling();

   abstract double getPrice();
}
