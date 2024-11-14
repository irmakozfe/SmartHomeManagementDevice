package domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class AutomationRule {

    @Id
    private int automationRuleId;

    private String name;

    //private Condition condition;

    @ManyToMany
    private List<Device> deviceList;
}
