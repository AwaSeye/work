package io.work.MapJeunesse.Controller;


import io.work.MapJeunesse.entity.PartenaireProjet;
import io.work.MapJeunesse.services.PartenaireProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/equipeProjet")
public class PartenaireProjetController {
    @Autowired
    private PartenaireProjetService partenaireProjetService;

    @GetMapping
    public List<PartenaireProjet> getAllPartenaireProjet(){

        return partenaireProjetService.getAllPartenaireProjet();
    }

    @PostMapping
    public PartenaireProjet savePartenaireProjet(@RequestBody PartenaireProjet partenaireProjet){
        return partenaireProjetService.savePartenaireProjet(partenaireProjet);
    }

    @PostMapping("modifier")
    public PartenaireProjet updatePartenaireProjet(@RequestBody PartenaireProjet partenaireProjet){
        return partenaireProjetService.updatePartenaireProjet(partenaireProjet);
    }

    @DeleteMapping("/{id}")
    public void deletePartenaireProjet(@PathVariable Long id){
        partenaireProjetService.deletePartenaireProjet(id);
    }
}
