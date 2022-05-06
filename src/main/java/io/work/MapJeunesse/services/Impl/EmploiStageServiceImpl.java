package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.EmploiStage;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.EmploiStageRepository;
import io.work.MapJeunesse.services.EmploiStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploiStageServiceImpl implements EmploiStageService {
    @Autowired
    private EmploiStageRepository emploiStageRepository;

    @Override
    public List<EmploiStage> getAllEmploiStage() {
        return emploiStageRepository.findAll();
    }

    @Override
    public EmploiStage saveEmploiStage(EmploiStage emploiStage) {
        return emploiStageRepository.save(emploiStage);
    }

    @Override
    public EmploiStage updateEmploiStage(EmploiStage emploiStage) {
        return emploiStageRepository.findById(emploiStage.getId())
                .map(article1 -> {
                    return emploiStageRepository.saveAndFlush(emploiStage);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Erreur !!!"));
    }

    @Override
    public void deleteEmploiStage(Long id) {

        emploiStageRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Erreur !!!"));
        emploiStageRepository.deleteById(id);
    }
}
