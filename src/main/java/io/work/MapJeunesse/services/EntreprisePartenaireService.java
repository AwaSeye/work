package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.EntreprisePartenaire;

import java.util.List;

public interface EntreprisePartenaireService {
    public List<EntreprisePartenaire> getAllEntreprisePartenaire();
    public EntreprisePartenaire saveEntreprisePartenaire(EntreprisePartenaire entreprisePartenaire);
    public EntreprisePartenaire updateEntreprisePartenaire(EntreprisePartenaire entreprisePartenaire);
    public void deleteEntreprisePartenaire(Long id);
}
