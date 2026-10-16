
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Vehicule;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IVehiculeService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vehicules")
@Tag(name = "Gestion des véhicules")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @Operation(description = "Ajouter ou modifier un véhicule")
    @PostMapping("/save")
    public Vehicule save(@RequestBody Vehicule vehicule) {
        return vehiculeService.save(vehicule);
    }

    @Operation(description = "Récupérer tous les véhicules")
    @GetMapping("/findAll")
    public List<Vehicule> findAll() {
        return vehiculeService.findAll();
    }

    @Operation(description = "Rechercher un véhicule par son ID")
    @GetMapping("/findById/{id}")
    public Vehicule findById(@PathVariable Long id) {
        return vehiculeService.findById(id);
    }

    @Operation(description = "Supprimer un véhicule par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        vehiculeService.deleteById(id);
    }
}
