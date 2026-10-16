
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Paiement;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IPaiementService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/paiements")
@Tag(name = "Gestion des paiements")
public class PaiementController {

    private final IPaiementService paiementService;

    @Operation(description = "Ajouter ou modifier un paiement")
    @PostMapping("/save")
    public Paiement save(@RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }

    @Operation(description = "Récupérer tous les paiements")
    @GetMapping("/findAll")
    public List<Paiement> findAll() {
        return paiementService.findAll();
    }

    @Operation(description = "Rechercher un paiement par son ID")
    @GetMapping("/findById/{id}")
    public Paiement findById(@PathVariable Long id) {
        return paiementService.findById(id);
    }

    @Operation(description = "Supprimer un paiement par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        paiementService.deleteById(id);
    }
}
