package services.impl;

import dao.TestDAO;
import dao.documents.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.TestService;

import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    private final TestDAO testDAO;

    @Autowired
    public TestServiceImpl(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    @Override
    public void addTest(Test test) {
          testDAO.addTest(test);
    }

    @Override
    public List<Test> getAllTests() {
        return testDAO.getAllTests();
    }

    @Override
    public void deleteTest(long id) {
        testDAO.deleteTestById(id);

    }

}
