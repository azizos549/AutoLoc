
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Equipement;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IEquipementService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/equipements")
@Tag(name = "Gestion des équipements")
public class EquipementController {

    private final IEquipementService equipementService;

    @Operation(description = "Ajouter ou modifier un équipement")
    @PostMapping("/save")
    public Equipement save(@RequestBody Equipement equipement) {
        return equipementService.save(equipement);
    }

    @Operation(description = "Récupérer tous les équipements")
    @GetMapping("/findAll")
    public List<Equipement> findAll() {
        return equipementService.findAll();
    }

    @Operation(description = "Rechercher un équipement par son ID")
    @GetMapping("/findById/{id}")
    public Equipement findById(@PathVariable Long id) {
        return equipementService.findById(id);
    }

    @Operation(description = "Supprimer un équipement par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        equipementService.deleteById(id);
    }
}
