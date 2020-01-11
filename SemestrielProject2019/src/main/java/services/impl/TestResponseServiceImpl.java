package services.impl;

import dao.TestResponseDAO;
import dao.documents.TestResponse;
import dao.impl.TestResponseDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.TestResponseService;

import java.util.List;

@Service
@Transactional
public class TestResponseServiceImpl implements TestResponseService {
    private final TestResponseDAO testResponseDAO;

    @Autowired
    public TestResponseServiceImpl(TestResponseDAO testResponseDAO) {
        this.testResponseDAO = testResponseDAO;
    }
    @Override
    public void addTestResponse(TestResponse testResponse) {
testResponseDAO.addTestResponse(testResponse);
    }

    @Override
    public List<TestResponse> getAllTestsResponses() {
        return testResponseDAO.getAllTestResponse();
    }

    @Override
    public void deleteTest(long id) {
testResponseDAO.deleteTestResponseById(id);
    }

}
