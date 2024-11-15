package domain.ports;

import domain.models.AutomationRule;

import java.util.List;
import java.util.Optional;

public interface AutomationService {
    
    AutomationRule createAutomationRule(AutomationRule rule);
    AutomationRule updateAutomationRule(int id, AutomationRule newRule);
    void deleteAutomationRule(int id);

    Optional<AutomationRule> getRuleById(int id);
    List<AutomationRule> getAllRules();
}
