package io.work.MapJeunesse.services.Impl;


import io.work.MapJeunesse.entity.Utilisateur;
import io.work.MapJeunesse.exceptions.ResourceNotFoundException;
import io.work.MapJeunesse.repositories.UtilisateurRepository;
import io.work.MapJeunesse.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

  @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.findById(utilisateur.getId())
                .map(utilisateur1 -> {
                    return utilisateurRepository.saveAndFlush(utilisateur);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Cet utilisateur n'existe pas"));
    }

    @Override
    public void deleteUtilisateur(Long id) {

        utilisateurRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cet utilisateur n'existe pas"));
        utilisateurRepository.deleteById(id);
    }
}
