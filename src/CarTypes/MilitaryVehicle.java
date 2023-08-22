package CarTypes;

public class MilitaryVehicle extends CarTemplate {
    @Override
    protected String getCarType() {
        return "Military Vehicle";
    }

    @Override
    protected int getNumberOfSeats() {
        return 7;
    }

    @Override
    protected double getSeatPrice() {
        return 120.0;
    }
}
