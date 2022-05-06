package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.EntreprisePartenaire;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.EntreprisePartenaireRepository;
import io.work.MapJeunesse.services.EntreprisePartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntreprisePartenaireServiceImpl implements EntreprisePartenaireService {
    @Autowired
    private EntreprisePartenaireRepository entreprisePartenaireRepository;

    @Override
    public List<EntreprisePartenaire> getAllEntreprisePartenaire() {
        return entreprisePartenaireRepository.findAll();
    }

    @Override
    public EntreprisePartenaire saveEntreprisePartenaire(EntreprisePartenaire entreprisePartenaire) {
        return entreprisePartenaireRepository.save(entreprisePartenaire);
    }

    @Override
    public EntreprisePartenaire updateEntreprisePartenaire(EntreprisePartenaire entreprisePartenaire) {
        return entreprisePartenaireRepository.findById(entreprisePartenaire.getId())
                .map(article1 -> {
                    return entreprisePartenaireRepository.saveAndFlush(entreprisePartenaire);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Cet entreprise n'existe pas"));
    }

    @Override
    public void deleteEntreprisePartenaire(Long id) {

        entreprisePartenaireRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cet entreprise n'existe pas"));
        entreprisePartenaireRepository.deleteById(id);
    }
}
