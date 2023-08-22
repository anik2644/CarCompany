package CarTypes.Brand;

import CarComponents.AirCooler.HighPoweredAC;
import CarComponents.CarSkeleton;
import CarComponents.Chesis.TabularChesis;
import CarComponents.Engine.Engine2100CC;
import CarComponents.Tire.WhitewallTire;
import CarTypes.CarGroup;
import CarTypes.CarTemplate;
import CarTypes.CarVariantFactory;

// BMW Car Group
public class BMWGroup extends CarGroup implements Brand {




    public CarTemplate CarTypes;
    CarSkeleton skeleton = new CarSkeleton();

     public BMWGroup()
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine2100CC());
        skeleton.addComponent(new TabularChesis());
        skeleton.addComponent(new HighPoweredAC());
        skeleton.addComponent(new WhitewallTire());
    }
    public BMWGroup(CarTemplate CarTypes)
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine2100CC());
        skeleton.addComponent(new TabularChesis());
        skeleton.addComponent(new HighPoweredAC());
        skeleton.addComponent(new WhitewallTire());
    }

    int getNumberOfSeats() {
        return CarTypes.getNumberOfSeats();
    }

    @Override
    protected String getGroupName() {
        return "BMW";
    }

    @Override
    public CarTemplate getCarTypes() {
        return this.CarTypes;
    }

    @Override
    protected String getBodyDesign() {
        return "Classic BMW";
    }

    @Override
    protected CarTemplate createCar(String variant) {
        return new CarVariantFactory(variant).createCar();
    }

    @Override
    public void setCartypes(CarTemplate usage) {
        CarTypes =usage;
    }
}
