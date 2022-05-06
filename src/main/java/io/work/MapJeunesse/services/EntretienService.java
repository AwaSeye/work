package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.Entretien;

import java.util.List;

public interface EntretienService {
    public List<Entretien> getAllEntretien();
    public Entretien saveEntretien(Entretien entretien);
    public Entretien updateEntretien(Entretien entretien);
    public void deleteEntretien(Long id);
}
