package services;

import dao.documents.TestResponse;

import java.util.List;

public interface TestResponseService {
    void addTestResponse(TestResponse testResponse);
    List<TestResponse> getAllTestsResponses();
    void deleteTest(long id);
}
