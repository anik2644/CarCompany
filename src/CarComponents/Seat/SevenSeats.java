package CarComponents.Seat;

import CarComponents.Seat.Seat;

public class SevenSeats extends Seat {
    @Override
    public int getNumberOfSeats() {
        return 7;
    }

    @Override
    public double getSeatPrice() {
        return 1500.0; // Price for seven seats
    }

    @Override
    public void assemble() {

    }
}
