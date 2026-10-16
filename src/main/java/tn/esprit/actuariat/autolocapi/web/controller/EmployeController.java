
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Employe;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IEmployeService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employes")
@Tag(name = "Gestion des employés")
public class EmployeController {

    private final IEmployeService employeService;

    @Operation(description = "Ajouter ou modifier un employé")
    @PostMapping("/save")
    public Employe save(@RequestBody Employe employe) {
        return employeService.save(employe);
    }

    @Operation(description = "Récupérer tous les employés")
    @GetMapping("/findAll")
    public List<Employe> findAll() {
        return employeService.findAll();
    }

    @Operation(description = "Rechercher un employé par son ID")
    @GetMapping("/findById/{id}")
    public Employe findById(@PathVariable Long id) {
        return employeService.findById(id);
    }

    @Operation(description = "Supprimer un employé par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        employeService.deleteById(id);
    }
}
