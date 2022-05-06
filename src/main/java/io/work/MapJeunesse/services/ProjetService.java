package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.Projet;

import java.util.List;

public interface ProjetService {
    public List<Projet> getAllProjet();
    public Projet saveProjet(Projet projet);
    public Projet updateProjet(Projet projet);
    public void deleteProjet(Long id);
}
