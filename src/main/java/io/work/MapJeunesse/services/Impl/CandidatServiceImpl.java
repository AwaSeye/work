package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.Candidat;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.CandidatRepository;
import io.work.MapJeunesse.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatServiceImpl implements CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    @Override
    public List<Candidat> getAllCandidat() {
        return candidatRepository.findAll();
    }

    @Override
    public Candidat saveCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public Candidat updateCandidat(Candidat candidat) {
        return candidatRepository.findById(candidat.getId())
                .map(article1 -> {
                    return candidatRepository.saveAndFlush(candidat);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Ce candidat n'existe pas"));
    }

    @Override
    public void deleteCandidat(Long id) {

        candidatRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Ce candidat n'existe pas"));
        candidatRepository.deleteById(id);
    }
}
