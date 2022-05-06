package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.Localite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocaliteRepository extends JpaRepository<Localite, Long>
{
    public List<Localite> findByAdresse(String adresse);
    public List<Localite> findByCommune(String commune);
    public List<Localite> findByDepartement(String departement);
    public List<Localite> findByRegion(String region);
}
