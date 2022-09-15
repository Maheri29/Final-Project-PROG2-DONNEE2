package com.projet.immob.repository;

import com.projet.immob.model.Immeuble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmeubleRepository extends JpaRepository<Immeuble, Integer> {
}
