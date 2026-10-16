
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Maintenance;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IMaintenanceService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/maintenances")
@Tag(name = "Gestion des maintenances")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @Operation(description = "Ajouter ou modifier une maintenance")
    @PostMapping("/save")
    public Maintenance save(@RequestBody Maintenance maintenance) {
        return maintenanceService.save(maintenance);
    }

    @Operation(description = "Récupérer toutes les maintenances")
    @GetMapping("/findAll")
    public List<Maintenance> findAll() {
        return maintenanceService.findAll();
    }

    @Operation(description = "Rechercher une maintenance par son ID")
    @GetMapping("/findById/{id}")
    public Maintenance findById(@PathVariable Long id) {
        return maintenanceService.findById(id);
    }

    @Operation(description = "Supprimer une maintenance par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        maintenanceService.deleteById(id);
    }
}
