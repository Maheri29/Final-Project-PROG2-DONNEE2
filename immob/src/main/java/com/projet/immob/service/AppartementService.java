package com.projet.immob.service;

import com.projet.immob.model.Appartement;
import com.projet.immob.repository.AppartementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class AppartementService {
    private AppartementRepository appartementRepository;

    public List<Appartement> getAllAppartement(){
        return appartementRepository.findAll();
    }
}
