package domain.ports;

import domain.models.EnergyReport;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface EnergyReportService {

    EnergyReport createEnergyReport(EnergyReport report);
    void deleteReport(int id);

    Optional<EnergyReport> getReportsById(int id);
    Optional<EnergyReport> getReportByDate(Date date);

    List<EnergyReport> getAllReports();
}
