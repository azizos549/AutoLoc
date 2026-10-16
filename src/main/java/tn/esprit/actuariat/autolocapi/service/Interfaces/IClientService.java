package tn.esprit.actuariat.autolocapi.service.Interfaces;

import tn.esprit.actuariat.autolocapi.domain.Client;

import java.util.List;


public interface IClientService {

    Client save(Client client);

    List<Client> findAll();

    Client findById(Long id);

    void deleteById(Long id);
}