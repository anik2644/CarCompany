package CarTypes;

public class SUV extends CarTemplate {
    @Override
    protected String getCarType() {
        return "SUV";
    }

    @Override
    protected int getNumberOfSeats() {
        return 15;
    }

    @Override
    protected double getSeatPrice() {
        return 150.0;
    }
}
