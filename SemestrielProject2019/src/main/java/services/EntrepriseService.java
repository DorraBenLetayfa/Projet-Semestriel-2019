package services;

import dao.documents.Entreprise;

import java.util.List;

public interface EntrepriseService {
    void addEntreprise(Entreprise entreprise);
    List<Entreprise> getAllEntreprises();
    void deleteEntreprise(long id);
}
