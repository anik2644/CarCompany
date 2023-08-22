package CarTypes.Usage;

import CarTypes.CarTemplate;

public class MilitaryVehicle extends CarTemplate implements UseField {
    @Override
    protected String getCarType() {
        return "Military Vehicle";
    }

    @Override
    public int getNumberOfSeats() {
        return 7;
    }

    @Override
    protected double getSeatPrice() {
        return 120.0;
    }
}
