package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.RepresentantEquipeProjet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepresentantEquipeProjetRepository extends JpaRepository<RepresentantEquipeProjet, Long>
{
    public List<RepresentantEquipeProjet> findByFonction(String fonction);
}
