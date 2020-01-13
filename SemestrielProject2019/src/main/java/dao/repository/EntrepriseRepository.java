package dao.repository;

import dao.documents.Entreprise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntrepriseRepository extends MongoRepository<Entreprise, Long> {
    Entreprise findEntrepriseByUserName(String entrepriseName);
}
