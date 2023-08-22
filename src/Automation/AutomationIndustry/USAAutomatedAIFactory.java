package Automation.AutomationIndustry;

import Automation.AutomatedAI;
import Automation.USABasedAutomatedAI;

public class USAAutomatedAIFactory implements AutomatedAIFactory {
    @Override
    public AutomatedAI createAutomatedAI() {

        return new USABasedAutomatedAI();
    }
}
