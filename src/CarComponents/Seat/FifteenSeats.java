package CarComponents.Seat;

public class FifteenSeats extends Seat {
    @Override
    public int getNumberOfSeats() {
        return 15;
    }

    @Override
    public double getSeatPrice() {
        return 2000.0; // Price for fifteen seats
    }

    @Override
    public void assemble() {

    }
}

