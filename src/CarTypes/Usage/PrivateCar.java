package CarTypes.Usage;


import CarTypes.CarTemplate;

public class PrivateCar extends CarTemplate  implements  UseField{
    @Override
    protected String getCarType() {
        return "Private Car";
    }

    @Override
    public int getNumberOfSeats() {
        return 5;
    }

    @Override
    protected double getSeatPrice() {
        return 100.0;
    }
}

