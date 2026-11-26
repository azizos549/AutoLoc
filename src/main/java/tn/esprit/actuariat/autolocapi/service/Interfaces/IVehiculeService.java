package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.StatutVehicule;
import tn.esprit.actuariat.autolocapi.domain.Vehicule;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import tn.esprit.actuariat.autolocapi.domain.CategorieVehicule;
public interface IVehiculeService {



        List<Vehicule> findAll();

        Vehicule findById(Long id);

        Vehicule save(Vehicule vehicule);

        void deleteById(Long id);
        List<Vehicule> findByMarque(String marque);
        List<Vehicule> findByCategorie(CategorieVehicule categorie);
        List<Vehicule> findByStatut(StatutVehicule statut);
        List<Vehicule> findByMarqueContaining(String marque);
        List<Vehicule> findByModeleStartingWith(String modele);
        List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);
        List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarif);
        List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarif);
        List<Vehicule> findByMarqueAndStatut(
                String marque,
                StatutVehicule statut
        );
        List<Vehicule> findByCategorieIn(List<CategorieVehicule> categories);
        List<Vehicule> findByMarqueAndTarifJournalierLessThan(
                String marque,
                BigDecimal tarif
        );
        List<Vehicule> findByStatutOrderByTarifJournalierAsc(
                StatutVehicule statut
        );
        List<Vehicule> findAllByOrderByTarifJournalierDesc();

}