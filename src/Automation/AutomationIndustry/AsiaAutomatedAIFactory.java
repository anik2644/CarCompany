package Automation.AutomationIndustry;

import Automation.AsiaBasedAutomatedAI;
import Automation.AutomatedAI;

public class AsiaAutomatedAIFactory implements AutomatedAIFactory {
    @Override
    public AutomatedAI createAutomatedAI() {
        return new AsiaBasedAutomatedAI();
    }
}
