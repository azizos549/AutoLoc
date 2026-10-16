
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Reservation;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IReservationService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reservations")
@Tag(name = "Gestion des réservations")
public class ReservationController {

    private final IReservationService reservationService;

    @Operation(description = "Ajouter ou modifier une réservation")
    @PostMapping("/save")
    public Reservation save(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }

    @Operation(description = "Récupérer toutes les réservations")
    @GetMapping("/findAll")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }

    @Operation(description = "Rechercher une réservation par son ID")
    @GetMapping("/findById/{id}")
    public Reservation findById(@PathVariable Long id) {
        return reservationService.findById(id);
    }

    @Operation(description = "Supprimer une réservation par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        reservationService.deleteById(id);
    }
}
