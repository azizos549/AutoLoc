package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.CategorieVehicule;
import tn.esprit.actuariat.autolocapi.domain.StatutVehicule;
import tn.esprit.actuariat.autolocapi.domain.Vehicule;
import tn.esprit.actuariat.autolocapi.repository.VehiculeRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IVehiculeService;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule save(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule findById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        vehiculeRepository.deleteById(id);

    }

    @Override
    public List<Vehicule> findByMarque(String marque) {
        return vehiculeRepository.findByMarque(marque);
    }

    @Override
    public List<Vehicule> findByCategorie(CategorieVehicule categorie) {
        return vehiculeRepository.findByCategorie(categorie);
    }
    @Override
    public List<Vehicule> findByStatut(StatutVehicule statut) {
        return vehiculeRepository.findByStatut(statut);
    }

    @Override
    public List<Vehicule> findByMarqueContaining(String marque) {
        return vehiculeRepository.findByMarqueContaining(marque);
    }

    @Override
    public List<Vehicule> findByModeleStartingWith(String modele) {
        return vehiculeRepository.findByModeleStartingWith(modele);
    }
    @Override
    public List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierGreaterThan(tarif);
    }

    @Override
    public List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierLessThan(tarif);
    }

    @Override
    public List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierGreaterThanEqual(tarif);
    }
    @Override
    public List<Vehicule> findByMarqueAndStatut(
            String marque,
            StatutVehicule statut) {

        return vehiculeRepository.findByMarqueAndStatut(marque, statut);
    }
    @Override
    public List<Vehicule> findByCategorieIn(List<CategorieVehicule> categories) {
        return vehiculeRepository.findByCategorieIn(categories);
    }
    @Override
    public List<Vehicule> findByMarqueAndTarifJournalierLessThan(
            String marque,
            BigDecimal tarif) {

        return vehiculeRepository.findByMarqueAndTarifJournalierLessThan(
                marque, tarif);
    }

    @Override
    public List<Vehicule> findByStatutOrderByTarifJournalierAsc(
            StatutVehicule statut) {

        return vehiculeRepository.findByStatutOrderByTarifJournalierAsc(statut);
    }

    @Override
    public List<Vehicule> findAllByOrderByTarifJournalierDesc() {
        return vehiculeRepository.findAllByOrderByTarifJournalierDesc();
    }
}
