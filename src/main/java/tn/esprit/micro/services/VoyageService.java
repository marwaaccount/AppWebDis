package tn.esprit.micro.services;

import java.util.List;

import tn.esprit.micro.entities.*;

public interface VoyageService {
  Voyage createVacation( Voyage vacation);

    List<Voyage> getAllVacations();

    Voyage getVacationById(int id);

    Voyage updateVacation( Voyage vacation);

    void deleteVacation(int id);
}
