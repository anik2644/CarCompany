package CarComponents.Seat;

public class FiveSeats implements Seat {
    @Override
    public int getNumberOfSeats() {
        return 5;
    }

    @Override
    public double getSeatPrice() {
        return 1000.0; // Price for five seats
    }
}
