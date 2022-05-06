package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.DossierCandidat;

import java.util.List;

public interface DossierCandidatService {
    public List<DossierCandidat> getAllDossierCandidat();
    public DossierCandidat saveDossierCandidat(DossierCandidat dossierCandidat);
    public DossierCandidat updateDossierCandidat(DossierCandidat dossierCandidat);
    public void deleteDossierCandidat(Long id);
}

