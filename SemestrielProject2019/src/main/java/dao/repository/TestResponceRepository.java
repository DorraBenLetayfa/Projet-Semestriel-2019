package dao.repository;

import dao.documents.TestResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestResponceRepository extends MongoRepository<TestResponse, Long> {
}
