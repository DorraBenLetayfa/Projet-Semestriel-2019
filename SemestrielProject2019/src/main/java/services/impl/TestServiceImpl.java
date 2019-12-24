package services.impl;

import dao.documents.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.TestService;

import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Override
    public void addTest(Test test) {

    }

    @Override
    public List<Test> getAllTests() {
        return null;
    }

    @Override
    public void deleteTest(Test test) {

    }

    @Override
    public void updateTest(Test test) {

    }
}
