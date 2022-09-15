package com.projet.immob.Controller;

import com.projet.immob.model.Quartier;
import com.projet.immob.service.QuartierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class QuartierController {
    private QuartierService quartierService;

    @GetMapping("/quartier")
    public List<Quartier> showAllClient(){
        return quartierService.getAllImmeuble();
    }
}
