package CarTypes;

// Concrete Car Types
public class RacingCar extends CarTemplate {
    @Override
    protected String getCarType() {
        return "Racing Car";
    }

    @Override
    protected int getNumberOfSeats() {
        return 1;
    }

    @Override
    protected double getSeatPrice() {
        return 500.0;
    }
}
