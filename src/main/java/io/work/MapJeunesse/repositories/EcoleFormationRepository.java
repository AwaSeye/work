package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.EcoleFormation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EcoleFormationRepository extends JpaRepository<EcoleFormation, Long>
{
    public List<EcoleFormation> findByNomEcole(String nomEcole);
    public List<EcoleFormation> findByFiliere(String filiere);
}
