package tn.esprit.actuariat.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Agence;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/api/agences")
@RequiredArgsConstructor
public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping
    public List<Agence> getAll() {
        return agenceService.findAll();
    }

    @GetMapping("/ville/{ville}")
    public List<Agence> getByVille(
            @PathVariable String ville) {

        return agenceService.findByVille(ville);
    }

    @GetMapping("/nom/termine-par/{nom}")
    public List<Agence> getByNomEndingWith(
            @PathVariable String nom) {

        return agenceService.findByNomEndingWith(nom);
    }


}