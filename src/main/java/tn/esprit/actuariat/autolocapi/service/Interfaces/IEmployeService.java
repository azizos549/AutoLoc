package tn.esprit.actuariat.autolocapi.service.Interfaces;


import tn.esprit.actuariat.autolocapi.domain.Employe;

import java.util.List;


public interface IEmployeService {

    Employe save(Employe employe);

    List<Employe> findAll();

    Employe findById(Long id);

    void deleteById(Long id);
}