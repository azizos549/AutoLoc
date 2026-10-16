package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.Agence;
import tn.esprit.actuariat.autolocapi.repository.AgenceRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IAgenceService;

import java.util.List;
import java.util.Optional;

@Service
//Tu utilises déjà l'injection par constructeur
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence save(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> findAll() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence findById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }
    @Override
    public void deleteById(Long id) {
        agenceRepository.deleteById(id);
    }
}
