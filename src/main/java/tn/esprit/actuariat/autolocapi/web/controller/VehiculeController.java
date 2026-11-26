
package tn.esprit.actuariat.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.CategorieVehicule;
import tn.esprit.actuariat.autolocapi.domain.StatutVehicule;
import tn.esprit.actuariat.autolocapi.domain.Vehicule;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IVehiculeService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@RequiredArgsConstructor
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @GetMapping
    public List<Vehicule> getAll() {
        return vehiculeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicule> getById(@PathVariable Long id) {
        Vehicule vehicule = vehiculeService.findById(id);
        if (vehicule == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(vehicule);
    }

    @PostMapping
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return vehiculeService.save(vehicule);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vehicule> update(
            @PathVariable Long id, @RequestBody Vehicule vehicule) {
        if (vehiculeService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(vehiculeService.save(vehicule));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (vehiculeService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        vehiculeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/marque/{marque}")
    public List<Vehicule> getByMarque(
            @PathVariable String marque) {

        return vehiculeService.findByMarque(marque);
    }
    @GetMapping("/categorie/{categorie}")
    public List<Vehicule> getByCategorie(
            @PathVariable CategorieVehicule categorie) {

        return vehiculeService.findByCategorie(categorie);
    }

    @GetMapping("/statut/{statut}")
    public List<Vehicule> getByStatut(
            @PathVariable StatutVehicule statut) {

        return vehiculeService.findByStatut(statut);
    }
    @GetMapping("/marque/contient/{marque}")
    public List<Vehicule> getByMarqueContaining(
            @PathVariable String marque) {

        return vehiculeService.findByMarqueContaining(marque);
    }

    @GetMapping("/modele/commence-par/{modele}")
    public List<Vehicule> getByModeleStartingWith(
            @PathVariable String modele) {

        return vehiculeService.findByModeleStartingWith(modele);
    }

    @GetMapping("/tarif/superieur/{tarif}")
    public List<Vehicule> getByTarifSuperieur(
            @PathVariable BigDecimal tarif) {

        return vehiculeService.findByTarifJournalierGreaterThan(tarif);
    }
    @GetMapping("/tarif/inferieur/{tarif}")
    public List<Vehicule> getByTarifInferieur(
            @PathVariable BigDecimal tarif) {

        return vehiculeService.findByTarifJournalierLessThan(tarif);
    }

    @GetMapping("/tarif/superieur-egal/{tarif}")
    public List<Vehicule> getByTarifSuperieurEgal(
            @PathVariable BigDecimal tarif) {

        return vehiculeService.findByTarifJournalierGreaterThanEqual(tarif);
    }
    @GetMapping("/marque/{marque}/statut/{statut}")
    public List<Vehicule> getByMarqueAndStatut(
            @PathVariable String marque,
            @PathVariable StatutVehicule statut) {

        return vehiculeService.findByMarqueAndStatut(marque, statut);
    }
    @GetMapping("/categories")
    public List<Vehicule> getByCategories(
            @RequestParam List<CategorieVehicule> categories) {

        return vehiculeService.findByCategorieIn(categories);
    }
    @GetMapping("/marque/{marque}/tarif-inferieur/{tarif}")
    public List<Vehicule> getByMarqueAndTarifInferieur(
            @PathVariable String marque,
            @PathVariable BigDecimal tarif) {

        return vehiculeService.findByMarqueAndTarifJournalierLessThan(
                marque, tarif);
    }

    @GetMapping("/disponibles/tri-croissant")
    public List<Vehicule> getDisponiblesCroissant() {

        return vehiculeService.findByStatutOrderByTarifJournalierAsc(
                StatutVehicule.DISPONIBLE);
    }

    @GetMapping("/tri-decroissant")
    public List<Vehicule> getAllDecroissant() {

        return vehiculeService.findAllByOrderByTarifJournalierDesc();
    }
}
