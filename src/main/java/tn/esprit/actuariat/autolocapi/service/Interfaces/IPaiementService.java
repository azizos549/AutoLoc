package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Paiement;

import java.util.List;


public interface IPaiementService {

    Paiement save(Paiement paiement);

    List<Paiement> findAll();

    Paiement findById(Long id);

    void deleteById(Long id);
}