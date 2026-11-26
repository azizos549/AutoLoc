package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Maintenance;

import java.time.LocalDate;
import java.util.List;

public interface MaintenanceRepository
        extends JpaRepository<Maintenance, Long> {
    List<Maintenance> findByDateFinBetween(
            LocalDate dateDebut,
            LocalDate dateFin
    );
}