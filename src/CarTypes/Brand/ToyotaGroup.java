package CarTypes.Brand;

import CarComponents.AirCooler.HighPoweredAC;
import CarComponents.AirCooler.LowPoweredAC;
import CarComponents.CarSkeleton;
import CarComponents.Chesis.BackboneChesis;
import CarComponents.Chesis.LadderFrameChesis;
import CarComponents.Engine.Engine1300CC;
import CarComponents.Engine.Engine1700CC;
import CarComponents.Tire.SlickTire;
import CarComponents.Tire.SpareTire;
import CarTypes.CarGroup;
import CarTypes.CarTemplate;
import CarTypes.CarVariantFactory;

// Toyota Car Group
public class ToyotaGroup extends CarGroup implements Brand {

    public CarTemplate CarTypes;
    CarSkeleton skeleton = new CarSkeleton();
    public ToyotaGroup()
    {
        this.CarTypes = CarTypes;
        skeleton.addComponent(new Engine1300CC());
        skeleton.addComponent(new BackboneChesis());
        skeleton.addComponent(new LowPoweredAC());
        skeleton.addComponent(new SlickTire());
    }
    ToyotaGroup(CarTemplate CarTypes)
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
        return "Toyota";
    }

    @Override
    public CarTemplate getCarTypes() {
        return this.CarTypes;
    }

    @Override
    public int getPrice() {
        int totalprice =0;
        System.out.println("EnginePrice: "+ new Engine1300CC().getPrice() );
        System.out.println("Chesis: "+ new BackboneChesis().getPrice() );
        System.out.println("Ac: "+ new LowPoweredAC().getPrice() );
        System.out.println("Tire: "+ new SlickTire().getPrice() );
        // System.out.println("Engine Price: "+skeleton);
        return totalprice;
    }

    @Override
    protected String getBodyDesign() {
        return "Signature Toyota";
    }

    @Override
    protected CarTemplate createCar(String variant) {
        return new CarVariantFactory(variant).createCar();
    }
}
