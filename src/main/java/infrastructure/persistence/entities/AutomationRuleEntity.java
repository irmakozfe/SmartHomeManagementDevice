package infrastructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AutomationRuleEntity {

    @Column(nullable = false)
    @Id
    private int automationRuleId;

    @Column(nullable = false)
    private String name;

    //modelsden cekebilecek miyiz
    //private Condition condition;
    //private Action action;

    @ManyToMany
    private List<DeviceEntity> deviceEntities;

    public AutomationRuleEntity() {

    }

    public AutomationRuleEntity(int automationRuleId, String name) {
        this.automationRuleId = automationRuleId;
        this.name = name;
        this.deviceEntities = new ArrayList<>();
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

    public List<DeviceEntity> getDevices() {
        return deviceEntities;
    }

    public void setDevices(List<DeviceEntity> deviceEntities) {
        this.deviceEntities = deviceEntities;
    }
}
