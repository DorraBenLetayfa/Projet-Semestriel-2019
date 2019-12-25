package dao.impl;

import dao.TestDAO;
import dao.documents.Test;
import dao.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDAOImpl implements TestDAO {
    final private TestRepository testRepository;
@Autowired
    public TestDAOImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public void addTest(Test test) {
    testRepository.save(test);

    }

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public void deleteTestById(Long id) {
    testRepository.deleteById(id);

    }
}
