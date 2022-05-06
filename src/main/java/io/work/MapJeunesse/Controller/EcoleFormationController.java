package io.work.MapJeunesse.Controller;

import io.work.MapJeunesse.entity.EcoleFormation;
import io.work.MapJeunesse.services.EcoleFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/formation")
public class EcoleFormationController {
    @Autowired
    private EcoleFormationService ecoleFormationService;

    @GetMapping
    public List<EcoleFormation> getAllEcoleFormation(){

        return ecoleFormationService.getAllEcoleFormation();
    }

    @PostMapping
    public EcoleFormation saveEcoleFormation(@RequestBody EcoleFormation ecoleFormation){
        return ecoleFormationService.saveEcoleFormation(ecoleFormation);
    }

    @PostMapping("modifier")
    public EcoleFormation updateEcoleFormation(@RequestBody EcoleFormation ecoleFormation){
        return ecoleFormationService.updateEcoleFormation(ecoleFormation);
    }

    @DeleteMapping("/{id}")
    public void deleteEcoleFormation(@PathVariable Long id){
        ecoleFormationService.deleteEcoleFormation(id);
    }
}
