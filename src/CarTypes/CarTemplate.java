package CarTypes;

// CarTemplate abstract class
public abstract class CarTemplate {
    protected abstract String getCarType();

    public abstract int getNumberOfSeats();

    protected abstract double getSeatPrice();

    public void buildCar() {
        System.out.println("Building " + getCarType());
        System.out.println("Number of Seats: " + getNumberOfSeats());
        System.out.println("Driving...");
        System.out.println("Total Price: $" + (getSeatPrice() * getNumberOfSeats()));
    }
}
