package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.Entretien;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.EntretienRepository;
import io.work.MapJeunesse.services.EntretienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntretienServiceImpl implements EntretienService {
    @Autowired
    private EntretienRepository entretienRepository;

    @Override
    public List<Entretien> getAllEntretien() {
        return entretienRepository.findAll();
    }

    @Override
    public Entretien saveEntretien(Entretien entretien) {
        return entretienRepository.save(entretien);
    }

    @Override
    public Entretien updateEntretien(Entretien entretien) {
        return entretienRepository.findById(entretien.getId())
                .map(article1 -> {
                    return entretienRepository.saveAndFlush(entretien);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Cet entretien n'existe pas"));
    }

    @Override
    public void deleteEntretien(Long id) {

        entretienRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cet entretien n'existe pas"));
        entretienRepository.deleteById(id);
    }
}
