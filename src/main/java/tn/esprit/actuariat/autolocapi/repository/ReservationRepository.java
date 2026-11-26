package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Maintenance;
import tn.esprit.actuariat.autolocapi.domain.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository
            extends JpaRepository<Reservation, Long> {
        List<Reservation> findByDateDebutAfter(LocalDate date);
    List<Reservation> findByDateFinBefore(LocalDate date);

    }