package CarComponents;

public class SingleSeat implements Seat {
    @Override
    public int getNumberOfSeats() {
        return 1;
    }

    @Override
    public double getSeatPrice() {
        return 500.0; // Price for a single seat
    }
}
