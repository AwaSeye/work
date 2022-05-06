package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.Candidat;

import java.util.List;

public interface CandidatService {
    public List<Candidat> getAllCandidat();
    public Candidat saveCandidat(Candidat candidat);
    public Candidat updateCandidat(Candidat candidat);
    public void deleteCandidat(Long id);
}
