package tn.esprit.actuariat.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.actuariat.autolocapi.domain.Agence;
import tn.esprit.actuariat.autolocapi.domain.Vehicule;


import java.util.List;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
    List<Agence> findByVille(String ville);
    List<Agence> findByNomEndingWith(String nom);

}
