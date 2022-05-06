package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.RepresentantEntreprise;

import java.util.List;

public interface RepresentantEntrepriseService {
    public List<RepresentantEntreprise> getAllRepresentantEntreprise();
    public RepresentantEntreprise saveRepresentantEntreprise(RepresentantEntreprise representantEntreprise);
    public RepresentantEntreprise updateRepresentantEntreprise(RepresentantEntreprise representantEntreprise);
    public void deleteRepresentantEntreprise(Long id);
}
