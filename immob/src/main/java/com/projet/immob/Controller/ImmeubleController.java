package com.projet.immob.Controller;

import com.projet.immob.model.Immeuble;
import com.projet.immob.service.ImmeubleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ImmeubleController {
    private ImmeubleService immeubleService;

    @GetMapping("/Immeuble")
    public List<Immeuble> showAllImmeuble(){
        return immeubleService.getAllImmeuble();
    }
}
