package io.work.MapJeunesse.services.Impl;

import io.work.MapJeunesse.entity.Localite;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.LocaliteRepository;
import io.work.MapJeunesse.services.LocaliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocaliteServiceImpl implements LocaliteService {
    @Autowired
    private LocaliteRepository localiteRepository;

    @Override
    public List<Localite> getAllLocalite() {
        return localiteRepository.findAll();
    }

    @Override
    public Localite saveLocalite(Localite localite) {
        return localiteRepository.save(localite);
    }

    @Override
    public Localite updateLocalite(Localite localite) {
        return localiteRepository.findById(localite.getId())
                .map(article1 -> {
                    return localiteRepository.saveAndFlush(localite);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Cette localite n'existe pas"));
    }

    @Override
    public void deleteLocalite(Long id) {

        localiteRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cette localite n'existe pas"));
        localiteRepository.deleteById(id);
    }
}
