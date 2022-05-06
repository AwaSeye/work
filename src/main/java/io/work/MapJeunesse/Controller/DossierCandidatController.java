package io.work.MapJeunesse.Controller;

import io.work.MapJeunesse.entity.DossierCandidat;
import io.work.MapJeunesse.services.DossierCandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/dossier")
public class DossierCandidatController {
    @Autowired
    private DossierCandidatService dossierCandidatService;

    @GetMapping
    public List<DossierCandidat> getAllDossierCandidat(){

        return dossierCandidatService.getAllDossierCandidat();
    }

    @PostMapping
    public DossierCandidat saveDossierCandidat(@RequestBody DossierCandidat dossierCandidat){
        return dossierCandidatService.saveDossierCandidat(dossierCandidat);
    }

    @PostMapping("modifier")
    public DossierCandidat updateDossierCandidat(@RequestBody DossierCandidat dossierCandidat){
        return dossierCandidatService.updateDossierCandidat(dossierCandidat);
    }

    @DeleteMapping("/{id}")
    public void deleteDossierCandidat(@PathVariable Long id){
        dossierCandidatService.deleteDossierCandidat(id);
    }
}
