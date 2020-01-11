package services;

import dao.documents.Test;

import java.util.List;

public interface TestService {
    void addTest(Test test);
    List<Test> getAllTests();
    void deleteTest(long id);

}
