package Automation.AutomationIndustry;

import Automation.AutomatedAI;
import Automation.USABasedAutomatedAI;

public class Ai_Factory implements AutomatedAIFactory {
    @Override
    public AutomatedAI createAutomatedAI() {
        return new USABasedAutomatedAI();
    }
}
