package CarTypes.Brand;

import CarTypes.CarGroup;
import CarTypes.CarTemplate;
import CarTypes.CarVariantFactory;

// Ferrari Car Group
public class FerrariGroup extends CarGroup {
    @Override
    protected String getGroupName() {
        return "Ferrari";
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
