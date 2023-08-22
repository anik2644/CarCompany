package CarTypes;

// BMW Car Group
public class BMWGroup extends CarGroup {
    @Override
    protected String getGroupName() {
        return "BMW";
    }

    @Override
    protected String getBodyDesign() {
        return "Classic BMW";
    }

    @Override
    protected CarTemplate createCar(String variant) {
        return new CarVariantFactory(variant).createCar();
    }
}
