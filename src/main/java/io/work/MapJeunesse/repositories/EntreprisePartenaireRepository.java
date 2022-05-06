package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.EntreprisePartenaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntreprisePartenaireRepository extends JpaRepository<EntreprisePartenaire, Long>
{
        public List<EntreprisePartenaire> findByRaisonSociale(String raisonSociale);
        public List<EntreprisePartenaire> findByDomaineActivite(String domaineActivite);
}
