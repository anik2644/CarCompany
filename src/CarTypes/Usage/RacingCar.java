package CarTypes.Usage;

import CarTypes.CarTemplate;

// Concrete Car Types
public class RacingCar extends CarTemplate implements UseField {
    @Override
    protected String getCarType() {
        return "Racing Car";
    }

    @Override
    public int getNumberOfSeats() {
        return 1;
    }

    @Override
    protected double getSeatPrice() {
        return 500.0;
    }
}
