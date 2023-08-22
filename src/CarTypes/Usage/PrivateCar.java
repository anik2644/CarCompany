package CarTypes.Usage;


import CarTypes.CarTemplate;

public class PrivateCar extends CarTemplate {
    @Override
    protected String getCarType() {
        return "Private Car";
    }

    @Override
    protected int getNumberOfSeats() {
        return 5;
    }

    @Override
    protected double getSeatPrice() {
        return 100.0;
    }
}

