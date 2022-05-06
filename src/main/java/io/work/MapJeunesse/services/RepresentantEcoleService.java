package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.RepresentantEcole;

import java.util.List;

public interface RepresentantEcoleService {
    public List<RepresentantEcole> getAllRepresentantEcole();
    public RepresentantEcole saveRepresentantEcole(RepresentantEcole representantEcole);
    public RepresentantEcole updateRepresentantEcole(RepresentantEcole representantEcole);
    public void deleteRepresentantEcole(Long id);
}
