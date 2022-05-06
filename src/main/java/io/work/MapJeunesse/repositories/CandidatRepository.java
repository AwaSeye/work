package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CandidatRepository extends JpaRepository<Candidat, Long > {
    public List<Candidat> findByDateNaissance(Date dateNaissance);
    public List<Candidat> findByNiveau(String niveau);
}
