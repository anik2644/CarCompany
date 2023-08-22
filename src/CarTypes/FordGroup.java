package CarTypes;

// Ford Car Group
public class FordGroup extends CarGroup {
    @Override
    protected String getGroupName() {
        return "Ford";
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
