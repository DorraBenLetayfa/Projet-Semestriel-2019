package dao.repository;

import dao.documents.TestResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestResponceRepository extends JpaRepository<TestResponse, Long> {
}
