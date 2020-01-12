package dao.repository;

import dao.documents.Problem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProblemRepository extends MongoRepository<Problem,Long> {
    Problem findProblemById(long id);
}

