package DecoratorDesignPattern;

import CarTypes.CarGroupWithAIAdapter;

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
