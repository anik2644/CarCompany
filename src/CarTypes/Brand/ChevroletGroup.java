package CarTypes.Brand;

import CarTypes.CarGroup;
import CarTypes.CarTemplate;
import CarTypes.CarVariantFactory;

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
