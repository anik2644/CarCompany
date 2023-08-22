package Automation;

import CarTypes.CarGroupWithAIAdapter;
import DecoratorDesignPattern.Car;

public class CarGroupWithAIDecorator implements Car {
    private final CarGroupWithAIAdapter carGroupWithAI;

    public CarGroupWithAIDecorator(CarGroupWithAIAdapter carGroupWithAI) {
        this.carGroupWithAI = carGroupWithAI;
    }


    @Override
    public void assemble() {
        carGroupWithAI.buildCars();
    }
}
