package tn.esprit.micro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.micro.entities.*;


@Repository
public interface VoyageRepository extends JpaRepository<Voyage, Integer> {
}

