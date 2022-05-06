package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.EmploiStage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmploiStageRepository extends JpaRepository<EmploiStage, Long> {
    public List<EmploiStage> findByDomaine(String domaine);
    public List<EmploiStage> findByLieu(String lieu);
    public List<EmploiStage> findByPoste(String poste);
}
