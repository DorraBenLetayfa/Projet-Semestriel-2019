package dao;

import dao.documents.TestResponse;

import java.util.List;

public interface TestRespponseDAO {
    void addTestResponse(TestResponse testResponse);
    List<TestResponse> getAllTestResponse();
}
