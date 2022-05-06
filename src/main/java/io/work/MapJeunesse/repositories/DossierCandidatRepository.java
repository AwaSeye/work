package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.DossierCandidat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DossierCandidatRepository extends JpaRepository<DossierCandidat, Long> {
    public List<DossierCandidat> findByCv(String cv);
    public List<DossierCandidat> findByLettreMotivation(String lettreMotivation);
    public List<DossierCandidat> findByDiplome(String diplome);
}
