package dao.repository;

import dao.documents.Startup;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StartupRepository extends MongoRepository<Startup,Long> {
}
