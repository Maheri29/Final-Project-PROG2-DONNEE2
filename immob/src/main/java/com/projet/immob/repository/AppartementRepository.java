package com.projet.immob.repository;

import com.projet.immob.model.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppartementRepository extends JpaRepository<Appartement, Integer> {
}
