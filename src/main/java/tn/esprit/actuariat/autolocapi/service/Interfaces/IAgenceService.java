package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Agence;

import java.util.List;


public interface IAgenceService {

    Agence save(Agence agence);

    List<Agence> findAll();

    Agence findById(Long id);

    void deleteById(Long id);
}
