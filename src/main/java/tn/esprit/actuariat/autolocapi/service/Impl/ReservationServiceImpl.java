package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.Reservation;
import tn.esprit.actuariat.autolocapi.repository.ReservationRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IReservationService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> findById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> findByDateDebutAfter(LocalDate date) {
        return reservationRepository.findByDateDebutAfter(date);
    }

    @Override
    public List<Reservation> findByDateFinBefore(LocalDate date) {
        return reservationRepository.findByDateFinBefore(date);
    }


}