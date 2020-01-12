package dao.repository;

import dao.documents.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterestRepository extends MongoRepository<Interest, Long> {
}
