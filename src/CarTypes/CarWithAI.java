package CarTypes;

import Automation.AutomatedAI;

public class CarWithAI extends CarTemplate {
    private CarTemplate car;
    private AutomatedAI ai;

    public CarWithAI(CarTemplate car, AutomatedAI ai) {
        this.car = car;
        this.ai = ai;
    }

    @Override
    protected String getCarType() {
        return car.getCarType();
    }

    @Override
    public int getNumberOfSeats() {
        return car.getNumberOfSeats();
    }

    @Override
    protected double getSeatPrice() {
        return car.getSeatPrice();
    }

    @Override
    public void buildCar() {
        car.buildCar();
        System.out.println("Adding automated AI system:");
        ai.drive();
    }
}
