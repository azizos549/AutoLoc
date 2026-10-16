
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Contrat;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IContratService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/contrats")
@Tag(name = "Gestion des contrats")
public class ContratController {

    private final IContratService contratService;

    @Operation(description = "Ajouter ou modifier un contrat")
    @PostMapping("/save")
    public Contrat save(@RequestBody Contrat contrat) {
        return contratService.save(contrat);
    }

    @Operation(description = "Récupérer tous les contrats")
    @GetMapping("/findAll")
    public List<Contrat> findAll() {
        return contratService.findAll();
    }

    @Operation(description = "Rechercher un contrat par son ID")
    @GetMapping("/findById/{id}")
    public Contrat findById(@PathVariable Long id) {
        return contratService.findById(id);
    }

    @Operation(description = "Supprimer un contrat par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        contratService.deleteById(id);
    }
}
