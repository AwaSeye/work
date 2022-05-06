package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.DossierCandidat;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.DossierCandidatRepository;
import io.work.MapJeunesse.services.DossierCandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DossierCandidatServiceImpl implements DossierCandidatService {
    @Autowired
    private DossierCandidatRepository dossierCandidatRepository;

    @Override
    public List<DossierCandidat> getAllDossierCandidat() {
        return dossierCandidatRepository.findAll();
    }

    @Override
    public DossierCandidat saveDossierCandidat(DossierCandidat dossierCandidat) {
        return dossierCandidatRepository.save(dossierCandidat);
    }

    @Override
    public DossierCandidat updateDossierCandidat(DossierCandidat dossierCandidat) {
        return dossierCandidatRepository.findById(dossierCandidat.getId())
                .map(article1 -> {
                    return dossierCandidatRepository.saveAndFlush(dossierCandidat);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Ce dossier n'existe pas"));
    }

    @Override
    public void deleteDossierCandidat(Long id) {

        dossierCandidatRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Ce dossier n'existe pas"));
        dossierCandidatRepository.deleteById(id);
    }
}
