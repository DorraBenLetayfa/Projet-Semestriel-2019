package dao.repository;

import dao.documents.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OfferRepository extends MongoRepository<Offer,Long> {
    Offer findOfferById(long id);

}
