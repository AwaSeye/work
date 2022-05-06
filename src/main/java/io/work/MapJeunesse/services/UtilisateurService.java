package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    public List<Utilisateur> getAllUtilisateur();
    public Utilisateur saveUtilisateur(Utilisateur utilisateur);
    public Utilisateur updateUtilisateur(Utilisateur utilisateur);
    public void deleteUtilisateur(Long id);
}
