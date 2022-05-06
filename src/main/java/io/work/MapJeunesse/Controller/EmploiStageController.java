package io.work.MapJeunesse.Controller;

import io.work.MapJeunesse.entity.EmploiStage;
import io.work.MapJeunesse.services.EmploiStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/emploiStage")
public class EmploiStageController {
    @Autowired
    private EmploiStageService emploiStageService;

    @GetMapping
    public List<EmploiStage> getAllEmploiStage(){

        return emploiStageService.getAllEmploiStage();
    }

    @PostMapping
    public EmploiStage saveEmploiStage(@RequestBody EmploiStage emploiStage){
        return emploiStageService.saveEmploiStage(emploiStage);
    }

    @PostMapping("modifier")
    public EmploiStage updateEmploiStage(@RequestBody EmploiStage emploiStage){
        return emploiStageService.updateEmploiStage(emploiStage);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploiStage(@PathVariable Long id){
        emploiStageService.deleteEmploiStage(id);
    }
}
