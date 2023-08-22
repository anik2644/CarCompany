package CarTypes.Brand;

import CarComponents.AirCooler.LowPoweredAC;
import CarComponents.CarSkeleton;
import CarComponents.Chesis.LadderFrameChesis;
import CarComponents.Engine.Engine1700CC;
import CarComponents.Tire.SpareTire;
import CarTypes.CarGroup;
import CarTypes.CarTemplate;
import CarTypes.CarVariantFactory;

// Ford Car Group
public class FordGroup extends CarGroup implements Brand {

    public CarTemplate CarTypes;
    CarSkeleton skeleton = new CarSkeleton();
    public FordGroup()
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine1700CC());
        skeleton.addComponent(new LadderFrameChesis());
        skeleton.addComponent(new LowPoweredAC());
        skeleton.addComponent(new SpareTire());
    }
    FordGroup(CarTemplate CarTypes)
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine1700CC());
        skeleton.addComponent(new LadderFrameChesis());
        skeleton.addComponent(new LowPoweredAC());
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
        return "Ford";
    }

    @Override
    public CarTemplate getCarTypes() {
        return this.CarTypes;
    }

    @Override
    protected String getBodyDesign() {
        return "Distinct Ford";
    }

    @Override
    protected CarTemplate createCar(String variant) {
        return new CarVariantFactory(variant).createCar();
    }
}
