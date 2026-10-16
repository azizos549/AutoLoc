
package tn.esprit.actuariat.autolocapi.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.actuariat.autolocapi.domain.Client;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IClientService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clients")
@Tag(name = "Gestion des clients")
public class ClientController {

    private final IClientService clientService;

    @Operation(description = "Ajouter ou modifier un client")
    @PostMapping("/save")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @Operation(description = "Récupérer tous les clients")
    @GetMapping("/findAll")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @Operation(description = "Rechercher un client par son ID")
    @GetMapping("/findById/{id}")
    public Client findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @Operation(description = "Supprimer un client par son ID")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }
}
