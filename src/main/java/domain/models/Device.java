package domain.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Device {

    @Id
    private int deviceId;
    private String status;

    @OneToMany
    private List<EnergyReport> energyReport;

    @OneToMany
    private List<AutomationRule> automationRule;

    @ManyToOne
    private Room room;

    public Device() {

    }

    public Device(int deviceIdd, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
