package dao;

import dao.documents.Entreprise;

import java.util.List;

public interface EntrepriseDAO {
    void addEntreprise(Entreprise entreprise);
    List<Entreprise> getAllEntreprises();
    void deleteEntrepriseById(Long id);
    Entreprise findEntrepriseByUserName(String entrepriseName);
    void saveAgent(Entreprise entreprise);
}
