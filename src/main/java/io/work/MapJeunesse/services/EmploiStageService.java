package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.EmploiStage;

import java.util.List;

public interface EmploiStageService {
    public List<EmploiStage> getAllEmploiStage();
    public EmploiStage saveEmploiStage(EmploiStage emploiStage);
    public EmploiStage updateEmploiStage(EmploiStage emploiStage);
    public void deleteEmploiStage(Long id);
}
