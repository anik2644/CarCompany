package CarComponents;

public class SevenSeats implements Seat {
    @Override
    public int getNumberOfSeats() {
        return 7;
    }

    @Override
    public double getSeatPrice() {
        return 1500.0; // Price for seven seats
    }
}
