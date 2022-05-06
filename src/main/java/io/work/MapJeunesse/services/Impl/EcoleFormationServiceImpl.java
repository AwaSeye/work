package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.EcoleFormation;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.EcoleFormationRepository;
import io.work.MapJeunesse.services.EcoleFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcoleFormationServiceImpl implements EcoleFormationService {
    @Autowired
    private EcoleFormationRepository ecoleFormationRepository;

    @Override
    public List<EcoleFormation> getAllEcoleFormation() {
        return ecoleFormationRepository.findAll();
    }

    @Override
    public EcoleFormation saveEcoleFormation(EcoleFormation ecoleFormation) {
        return ecoleFormationRepository.save(ecoleFormation);
    }

    @Override
    public EcoleFormation updateEcoleFormation(EcoleFormation ecoleFormation) {
        return ecoleFormationRepository.findById(ecoleFormation.getId())
                .map(article1 -> {
                    return ecoleFormationRepository.saveAndFlush(ecoleFormation);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Cet ecole n'existe pas"));
    }

    @Override
    public void deleteEcoleFormation(Long id) {

        ecoleFormationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cet ecole n'existe pas"));
        ecoleFormationRepository.deleteById(id);
    }
}
