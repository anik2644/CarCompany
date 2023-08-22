package CarTypes.Brand;

import CarComponents.AirCooler.LowPoweredAC;
import CarComponents.CarSkeleton;
import CarComponents.Chesis.BackboneChesis;
import CarComponents.Engine.Engine1300CC;
import CarComponents.Tire.SlickTire;
import CarTypes.CarGroup;
import CarTypes.CarTemplate;
import CarTypes.CarVariantFactory;

// Chevrolet Car Group
public class ChevroletGroup extends CarGroup implements Brand {

    public CarTemplate CarTypes;
    CarSkeleton skeleton = new CarSkeleton();
    public ChevroletGroup()
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine1300CC());
        skeleton.addComponent(new BackboneChesis());
        skeleton.addComponent(new LowPoweredAC());
        skeleton.addComponent(new SlickTire());
    }
    ChevroletGroup(CarTemplate CarTypes)
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine1300CC());
        skeleton.addComponent(new BackboneChesis());
        skeleton.addComponent(new LowPoweredAC());
        skeleton.addComponent(new SlickTire());
    }

    public void setCartypes(CarTemplate usage) {
        CarTypes =usage;
    }
    int getNumberOfSeats() {
        return CarTypes.getNumberOfSeats();
    }
    @Override
    protected String getGroupName() {
        return "Chevrolet";
    }

    @Override
    public CarTemplate getCarTypes() {
        return this.CarTypes;
    }

    @Override
    protected String getBodyDesign() {
        return "Iconic Chevrolet";
    }

    @Override
    protected CarTemplate createCar(String variant) {
        return new CarVariantFactory(variant).createCar();
    }
}
