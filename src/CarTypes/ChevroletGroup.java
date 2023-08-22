package CarTypes;

// Chevrolet Car Group
public class ChevroletGroup extends CarGroup {
    @Override
    protected String getGroupName() {
        return "Chevrolet";
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
