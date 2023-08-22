package CarTypes.Brand;

import CarComponents.AirCooler.HighPoweredAC;
import CarComponents.CarSkeleton;
import CarComponents.Chesis.BackboneChesis;
import CarComponents.Engine.Engine1700CC;
import CarComponents.Tire.SpareTire;
import CarTypes.CarGroup;
import CarTypes.CarTemplate;
import CarTypes.CarVariantFactory;

// Ferrari Car Group
public class FerrariGroup extends CarGroup implements Brand {

    public CarTemplate CarTypes;
    CarSkeleton skeleton = new CarSkeleton();
    public FerrariGroup()
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine1700CC());
        skeleton.addComponent(new BackboneChesis());
        skeleton.addComponent(new HighPoweredAC());
        skeleton.addComponent(new SpareTire());
    }

    FerrariGroup(CarTemplate CarTypes)
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine1700CC());
        skeleton.addComponent(new BackboneChesis());
        skeleton.addComponent(new HighPoweredAC());
        skeleton.addComponent(new SpareTire());
    }
    public void setCartypes(CarTemplate usage) {
        CarTypes =usage;
    }
    int getNumberOfSeats() {
        return CarTypes.getNumberOfSeats();
    }
    @Override
    protected String getGroupName() {
        return "Ferrari";
    }

    @Override
    public CarTemplate getCarTypes() {
        return this.CarTypes;
    }

    @Override
    protected String getBodyDesign() {
        return "Unique Ferrari";
    }

    @Override
    protected CarTemplate createCar(String variant) {
        return new CarVariantFactory(variant).createCar();
    }
}
