package com.projet.immob.service;

import com.projet.immob.model.Quartier;
import com.projet.immob.repository.QuartierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class QuartierService {
    private QuartierRepository quartierRepository;

    public List<Quartier> getAllImmeuble(){
        return quartierRepository.findAll();
    }
}
