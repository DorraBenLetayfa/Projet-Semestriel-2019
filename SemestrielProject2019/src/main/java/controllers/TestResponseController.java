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
    public String addUser(@RequestBody TestResponse testResponse) {
        testResponseService.addTestResponse(testResponse);
        return "user  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteUser(@RequestBody long id) {
        testResponseService.deleteTest(id);
        return "user deleted";
    }

    @GetMapping(value = "/all")
    private List<TestResponse> getAllTestResponse() {
        return testResponseService.getAllTestsResponses();

    }
}
