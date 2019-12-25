package dao.impl;

import dao.TestRespponseDAO;
import dao.documents.TestResponse;
import dao.repository.TestRepository;
import dao.repository.TestResponceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestResponseDAOImpl implements TestRespponseDAO {
    private final TestResponceRepository testResponceRepository;

    @Autowired
    public TestResponseDAOImpl(TestResponceRepository testResponceRepository) {
        this.testResponceRepository = testResponceRepository;
    }

    @Override
    public void addTestResponse(TestResponse testResponse) {
       testResponceRepository.save(testResponse);
    }

    @Override
    public List<TestResponse> getAllTestResponse() {
        return testResponceRepository.findAll();
    }
}
