package infrastructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AutomationRule {

    @Column(nullable = false)
    @Id
    private int automationRuleId;

    @Column(nullable = false)
    private String name;

    //modelsden cekebilecek miyiz
    //private Condition condition;
    //private Action action;

    @ManyToMany
    private List<Device> devices;

    public AutomationRule() {

    }

    public AutomationRule(int automationRuleId, String name) {
        this.automationRuleId = automationRuleId;
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public int getAutomationRuleId() {
        return automationRuleId;
    }

    public void setAutomationRuleId(int automationRuleId) {
        this.automationRuleId = automationRuleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
