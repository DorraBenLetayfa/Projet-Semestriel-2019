package controllers;

import dao.documents.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.TestResponseService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/TestResponse")
public class TestResponseController {
    @Autowired
    private TestResponseService testResponseService;

    @PostMapping(value = "/add")
    public String addTestResponse(@RequestBody TestResponse testResponse) {
        testResponseService.addTestResponse(testResponse);
        return "test Response  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteTestResponse(@RequestBody long id) {
        testResponseService.deleteTestResponse(id);
        return "test response deleted";
    }

    @GetMapping(value = "/all")
    private List<TestResponse> getAllTestResponse() {
        return testResponseService.getAllTestsResponses();

    }
}
