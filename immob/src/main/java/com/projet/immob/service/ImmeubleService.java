package com.projet.immob.service;

import com.projet.immob.model.Immeuble;
import com.projet.immob.repository.ImmeubleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ImmeubleService {
    private ImmeubleRepository immeubleRepository;

    public List<Immeuble> getAllImmeuble(){
        return immeubleRepository.findAll();
    }
}
