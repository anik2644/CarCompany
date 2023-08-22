import Automation.AutomationIndustry.AsiaAutomatedAIFactory;
import Automation.AutomationIndustry.AutomatedAIFactory;

import Automation.AutomationIndustry.USAAutomatedAIFactory;
import CarTypes.CarGroup;
import CarTypes.CarGroupWithAIAdapter;
import CarTypes.FerrariGroup;
import CarTypes.FordGroup;

public class Main {
    public static void main(String[] args) {
        AutomatedAIFactory asiaAI = new AsiaAutomatedAIFactory();
        AutomatedAIFactory usaAI = new USAAutomatedAIFactory();

        CarGroup ferrariGroup = new FerrariGroup();
        CarGroup fordGroup = new FordGroup();

        CarGroup ferrariGroupWithAsiaAI = new CarGroupWithAIAdapter(ferrariGroup, asiaAI);
        CarGroup fordGroupWithUSAAI = new CarGroupWithAIAdapter(fordGroup, usaAI);

        System.out.println("Building cars for different groups with AI:");
        ferrariGroupWithAsiaAI.buildCars();
        System.out.println();
        fordGroupWithUSAAI.buildCars();
    }
}