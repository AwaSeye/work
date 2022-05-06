package io.work.MapJeunesse.Controller;

import io.work.MapJeunesse.entity.EntreprisePartenaire;
import io.work.MapJeunesse.services.EntreprisePartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/entreprise")
public class EntreprisePartenaireController {
    @Autowired
    private EntreprisePartenaireService entreprisePartenaireService;

    @GetMapping
    public List<EntreprisePartenaire> getAllEntreprisePartenaire(){

        return entreprisePartenaireService.getAllEntreprisePartenaire();
    }

    @PostMapping
    public EntreprisePartenaire saveEntreprisePartenaire(@RequestBody EntreprisePartenaire entreprisePartenaire){
        return entreprisePartenaireService.saveEntreprisePartenaire(entreprisePartenaire);
    }

    @PostMapping("modifier")
    public EntreprisePartenaire updateEntreprisePartenaire(@RequestBody EntreprisePartenaire entreprisePartenaire){
        return entreprisePartenaireService.updateEntreprisePartenaire(entreprisePartenaire);
    }

    @DeleteMapping("/{id}")
    public void deleteEntreprisePartenaire(@PathVariable Long id){
        entreprisePartenaireService.deleteEntreprisePartenaire(id);
    }
}
