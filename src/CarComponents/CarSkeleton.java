package CarComponents;

import CarComponents.Tire.Tire;
import CarComponents.Tire.WhitewallTire;

import java.util.ArrayList;
import java.util.List;

public class CarSkeleton implements CarComponent {


    public int Price()
    {
        int tota=0;

        for (int i=0;i< components.size();i++)
        {

            System.out.println( );
        }

        return tota;
    }
    private List<CarComponent> components = new ArrayList<>();

    public void addComponent(CarComponent component) {

        assemble();
        components.add(component);
    }

    @Override
    public void assemble() {
     //   System.out.println("Building Car:");
        for (CarComponent component : components) {
            component.assemble();
        }
      //  System.out.println("Car assembly complete.");
    }
}

