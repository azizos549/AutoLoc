package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Maintenance;
import tn.esprit.actuariat.autolocapi.domain.Reservation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IReservationService {

    Reservation save(Reservation reservation);

    List<Reservation> findAll();

    Optional<Reservation> findById(Long id);

    void deleteById(Long id);
    List<Reservation> findByDateDebutAfter(LocalDate date);
    List<Reservation> findByDateFinBefore(LocalDate date);

}