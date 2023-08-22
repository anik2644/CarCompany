package CarTypes.Usage;

import CarTypes.CarTemplate;

public class SUV extends CarTemplate implements UseField {
    @Override
    protected String getCarType() {
        return "SUV";
    }

    @Override
    public int getNumberOfSeats() {
        return 15;
    }

    @Override
    protected double getSeatPrice() {
        return 150.0;
    }
}
