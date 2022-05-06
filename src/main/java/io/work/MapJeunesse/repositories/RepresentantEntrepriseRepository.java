package io.work.MapJeunesse.repositories;


import io.work.MapJeunesse.entity.RepresentantEntreprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepresentantEntrepriseRepository extends JpaRepository<RepresentantEntreprise, Long>
{
    public List<RepresentantEntreprise> findByFonction(String fonction);
}
