package io.work.MapJeunesse.Controller;


import io.work.MapJeunesse.entity.Candidat;
import io.work.MapJeunesse.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/candidat")
public class CandidatController {
    @Autowired
    private CandidatService candidatService;

    @GetMapping
    public List<Candidat> getAllCandidat(){

        return candidatService.getAllCandidat();
    }

    @PostMapping
    public Candidat saveCandidat(@RequestBody Candidat candidat){
        return candidatService.saveCandidat(candidat);
    }

    @PostMapping("modifier")
    public Candidat updateCandidat(@RequestBody Candidat candidat){
        return candidatService.updateCandidat(candidat);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidat(@PathVariable Long id){
        candidatService.deleteCandidat(id);
    }
}





