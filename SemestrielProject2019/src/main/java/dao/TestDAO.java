package dao;

import dao.documents.Test;

import java.util.List;

public interface TestDAO {
    void addTest(Test test);
    List<Test> getAllTests();
    void deleteTestById(Long id);
}
