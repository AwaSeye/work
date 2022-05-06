package io.work.MapJeunesse.services;

import io.work.MapJeunesse.entity.EcoleFormation;

import java.util.List;

public interface EcoleFormationService {
    public List<EcoleFormation> getAllEcoleFormation();
    public EcoleFormation saveEcoleFormation(EcoleFormation ecoleFormation);
    public EcoleFormation updateEcoleFormation(EcoleFormation ecoleFormation);
    public void deleteEcoleFormation(Long id);
}
