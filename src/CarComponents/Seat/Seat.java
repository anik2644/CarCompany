package CarComponents.Seat;

import CarComponents.CarComponent;

public abstract class Seat implements CarComponent {
   abstract   int getNumberOfSeats();

   abstract double getSeatPrice();
}
