package CarTypes;

import Automation.AutomatedAI;
import Automation.AutomationIndustry.AutomatedAIFactory;

public class CarGroupWithAIAdapter extends CarGroup {
    private final CarGroup originalCarGroup;
    private final AutomatedAIFactory aiFactory;

    public CarGroupWithAIAdapter(CarGroup originalCarGroup, AutomatedAIFactory aiFactory) {
        this.originalCarGroup = originalCarGroup;
        this.aiFactory = aiFactory;
    }

    @Override
    protected String getGroupName() {
        return originalCarGroup.getGroupName();
    }

    @Override
    public CarTemplate getCarTypes() {
        return originalCarGroup.getCarTypes();
    }

    @Override
    protected String getBodyDesign() {
        return originalCarGroup.getBodyDesign() + " with AI";
    }

    @Override
    protected CarTemplate createCar(String variant) {
        CarTemplate car = originalCarGroup.createCar(variant);
        AutomatedAI ai = aiFactory.createAutomatedAI();
        return new CarWithAI(car, ai);
    }
}
