package tn.esprit.actuariat.autolocapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.actuariat.autolocapi.domain.Equipement;
import tn.esprit.actuariat.autolocapi.repository.EquipementRepository;
import tn.esprit.actuariat.autolocapi.service.Interfaces.IEquipementService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement save(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement findById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        equipementRepository.deleteById(id);
    }
}
