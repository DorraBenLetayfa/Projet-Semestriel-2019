package services.impl;

import dao.EntrepriseDAO;
import dao.documents.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.EntrepriseService;

import java.util.List;

@Service
@Transactional
public class EntrepriseServiceImpl implements EntrepriseService {
    private final EntrepriseDAO entrepriseDAO;
    @Autowired
    public EntrepriseServiceImpl(EntrepriseDAO entrepriseDAO) {
        this.entrepriseDAO = entrepriseDAO;
    }


    @Override
    public void addEntreprise(Entreprise entreprise) {
entrepriseDAO.addEntreprise(entreprise);
    }

    @Override
    public List<Entreprise> getAllEntreprises() {
        return entrepriseDAO.getAllEntreprises();
    }

    @Override
    public void deleteEntreprise(long id) {
     entrepriseDAO.deleteEntrepriseById(id);
    }
}
