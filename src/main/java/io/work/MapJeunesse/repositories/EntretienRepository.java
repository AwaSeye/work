package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntretienRepository extends JpaRepository<Entretien, Long>
{
    public List<Entretien> findByRetour(String retour);
    public List<Entretien> findByCommentaire(String commentaire);
}
