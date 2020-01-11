package dao;

import dao.documents.TestResponse;

import java.util.List;

public interface TestResponseDAO {
    void addTestResponse(TestResponse testResponse);
    List<TestResponse> getAllTestResponse();
    void deleteTestResponseById(Long id);
}
