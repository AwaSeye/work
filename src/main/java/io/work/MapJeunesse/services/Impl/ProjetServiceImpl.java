package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.Projet;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.ProjetRepository;
import io.work.MapJeunesse.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImpl implements ProjetService {
    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public List<Projet> getAllProjet() {
        return projetRepository.findAll();
    }

    @Override
    public Projet saveProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.findById(projet.getId())
                .map(article1 -> {
                    return projetRepository.saveAndFlush(projet);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Ce projet n'existe pas"));
    }

    @Override
    public void deleteProjet(Long id) {

        projetRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Ce projet n'existe pas"));
        projetRepository.deleteById(id);
    }
}
