package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.PartenaireProjet;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.PartenaireProjetRepository;
import io.work.MapJeunesse.services.PartenaireProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartenaireProjetServiceImpl implements PartenaireProjetService {
    @Autowired
    private PartenaireProjetRepository partenaireProjetRepository;

    @Override
    public List<PartenaireProjet> getAllPartenaireProjet() {
        return partenaireProjetRepository.findAll();
    }

    @Override
    public PartenaireProjet savePartenaireProjet(PartenaireProjet partenaireProjet) {
        return partenaireProjetRepository.save(partenaireProjet);
    }

    @Override
    public PartenaireProjet updatePartenaireProjet(PartenaireProjet partenaireProjet) {
        return partenaireProjetRepository.findById(partenaireProjet.getId())
                .map(article1 -> {
                    return partenaireProjetRepository.saveAndFlush(partenaireProjet);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Ce partenaire n'existe pas"));
    }

    @Override
    public void deletePartenaireProjet(Long id) {

        partenaireProjetRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Ce partenaire n'existe pas"));
        partenaireProjetRepository.deleteById(id);
    }
}
