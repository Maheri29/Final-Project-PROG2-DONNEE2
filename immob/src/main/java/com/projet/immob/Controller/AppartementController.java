package com.projet.immob.Controller;

import com.projet.immob.model.Appartement;
import com.projet.immob.service.AppartementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

public class AppartementController {
    private AppartementService appartementService;

    @GetMapping("/Appartement")
    public List<Appartement> showAllAppartement(){
        return appartementService.getAllAppartement();

    }
}

