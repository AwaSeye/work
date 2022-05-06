package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.RepresentantEquipeProjet;

import java.util.List;

public interface RepresentantEquipeProjetService {
    public List<RepresentantEquipeProjet> getAllRepresentantEquipeProjet();
    public RepresentantEquipeProjet saveRepresentantEquipeProjet(RepresentantEquipeProjet representantEquipeProjet);
    public RepresentantEquipeProjet updateRepresentantEquipeProjet(RepresentantEquipeProjet representantEquipeProjet);
    public void deleteRepresentantEquipeProjet(Long id);
}
