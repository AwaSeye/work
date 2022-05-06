package io.work.MapJeunesse.repositories;

import io.work.MapJeunesse.entity.RepresentantEcole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepresentantEcoleRepository extends JpaRepository<RepresentantEcole, Long>
{
    public List<RepresentantEcole> findByFonction(String fonction);
}
