package infrastructure.persistence.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Device {

    public enum deviceType{
        Switchable,
        Adjustable
    }

    @Column(nullable = false)
    @Id
    private int deviceId;

    @Column(nullable = false)
    private boolean status; // on/off

    @Column(nullable = false)
    private deviceType deviceType;

    @OneToMany
    private List<EnergyReport> energyReports;

    @OneToMany
    private List<AutomationRule> automationRules;

    @ManyToOne
    private Room room;

    public Device() {

    }

    public Device(int deviceId, deviceType deviceType, Room room) {
        this.deviceId = deviceId;
        this.status = false;
        this.deviceType = deviceType;
        this.room = room;
        this.energyReports = new ArrayList<>();
        this.automationRules = new ArrayList<>();
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Device.deviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Device.deviceType deviceType) {
        this.deviceType = deviceType;
    }

    public List<EnergyReport> getEnergyReports() {
        return energyReports;
    }

    public void setEnergyReports(List<EnergyReport> energyReports) {
        this.energyReports = energyReports;
    }

    public List<AutomationRule> getAutomationRules() {
        return automationRules;
    }

    public void setAutomationRules(List<AutomationRule> automationRules) {
        this.automationRules = automationRules;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

