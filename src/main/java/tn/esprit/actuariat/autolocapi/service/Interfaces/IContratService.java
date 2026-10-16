package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Contrat;

import java.util.List;


public interface IContratService {

    Contrat save(Contrat contrat);

    List<Contrat> findAll();

    Contrat findById(Long id);

    void deleteById(Long id);
}
