package CarComponents.Seat;

import CarComponents.Seat.Seat;

public class SingleSeat extends Seat {
    @Override
    public int getNumberOfSeats() {
        return 1;
    }

    @Override
    public double getSeatPrice() {
        return 500.0; // Price for a single seat
    }

    @Override
    public void assemble() {

    }
}
