package CarTypes;

// Toyota Car Group
public class ToyotaGroup extends CarGroup {
    @Override
    protected String getGroupName() {
        return "Toyota";
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
