
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.actuariat.autolocapi.domain.Agence;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/agences")
@Tag(name = "Gestion des agences")
public class AgenceController {

    private final IAgenceService agenceService;

    @Operation(description = "Ajouter ou modifier une agence")
    @PostMapping("/save")
    public Agence save(@RequestBody Agence agence) {
        return agenceService.save(agence);
    }

    @Operation(description = "Récupérer toutes les agences")
    @GetMapping("/findAll")
    public List<Agence> findAll() {
        return agenceService.findAll();
    }

    @Operation(description = "Rechercher une agence par son ID")
    @GetMapping("/findById/{id}")
    public Agence findById(@PathVariable Long id) {
        return agenceService.findById(id);
    }

    @Operation(description = "Supprimer une agence par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        agenceService.deleteById(id);
    }
}
