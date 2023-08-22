package CarComponents;

import CarComponents.Tire.Tire;
import CarComponents.Tire.WhitewallTire;

import java.util.ArrayList;
import java.util.List;

public class CarSkeleton implements CarComponent {

    private List<CarComponent> components = new ArrayList<>();

    public void addComponent(CarComponent component) {
        components.add(component);
    }

    @Override
    public void assemble() {
        System.out.println("Building Car:");
        for (CarComponent component : components) {
            component.assemble();
        }
        System.out.println("Car assembly complete.");
    }
}

