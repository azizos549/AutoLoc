package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Maintenance;

import java.util.List;


public interface IMaintenanceService {

    Maintenance save(Maintenance maintenance);

    List<Maintenance> findAll();

    Maintenance findById(Long id);

    void deleteById(Long id);
}
