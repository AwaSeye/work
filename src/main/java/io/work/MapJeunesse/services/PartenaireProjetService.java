package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.PartenaireProjet;

import java.util.List;

public interface PartenaireProjetService {
    public List<PartenaireProjet> getAllPartenaireProjet();
    public PartenaireProjet savePartenaireProjet(PartenaireProjet partenaireProjet);
    public PartenaireProjet updatePartenaireProjet(PartenaireProjet partenaireProjet);
    public void deletePartenaireProjet(Long id);
}
