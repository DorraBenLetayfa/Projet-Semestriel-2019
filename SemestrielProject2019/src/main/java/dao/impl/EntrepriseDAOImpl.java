package dao.impl;

import dao.EntrepriseDAO;
import dao.documents.Entreprise;
import dao.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntrepriseDAOImpl implements EntrepriseDAO {
    final private EntrepriseRepository entrepriseRepository;
@Autowired
    public EntrepriseDAOImpl(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public void addEntreprise(Entreprise entreprise) {
entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> getAllEntreprises() {
        return entrepriseRepository.findAll();
    }

    @Override
    public void deleteEntrepriseById(Long id) {
entrepriseRepository.deleteById(id);
    }

    @Override
    public Entreprise findEntrepriseByUserName(String entrepriseName) {
        return entrepriseRepository.findEntrepriseByUserName(entrepriseName);
    }

    @Override
    public void saveAgent(Entreprise entreprise) {
entrepriseRepository.save(entreprise);
    }
}
