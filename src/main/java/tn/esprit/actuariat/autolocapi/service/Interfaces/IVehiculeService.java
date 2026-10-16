package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Vehicule;

import java.util.List;


public interface IVehiculeService {

    Vehicule save(Vehicule vehicule);

    List<Vehicule> findAll();

    Vehicule findById(Long id);

    void deleteById(Long id);
}