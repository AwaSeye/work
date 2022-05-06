package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.Localite;

import java.util.List;

public interface LocaliteService {
    public List<Localite> getAllLocalite();
    public Localite saveLocalite(Localite localite);
    public Localite updateLocalite(Localite localite);
    public void deleteLocalite(Long id);
}
