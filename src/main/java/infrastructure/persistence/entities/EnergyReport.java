package infrastructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class EnergyReport {

    @Column(nullable = false)
    @Id
    private int energyReportId;

    private Date date;

    @ManyToOne
    private Device device;

    @Column
    private double totalComsumption;

    public EnergyReport() {

    }

    public EnergyReport(int energyReportId, Date date, Device device, double totalComsumption) {
        this.energyReportId = energyReportId;
        this.date = date;
        this.device = device;
        this.totalComsumption = 0;
    }

    public int getEnergyReportId() {
        return energyReportId;
    }

    public void setEnergyReportId(int energyReportId) {
        this.energyReportId = energyReportId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public double getTotalComsumption() {
        return totalComsumption;
    }

    public void setTotalComsumption(double totalComsumption) {
        this.totalComsumption = totalComsumption;
    }
}
