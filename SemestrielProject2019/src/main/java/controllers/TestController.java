package controllers;

import dao.documents.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.TestService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/test")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping(value = "/add")
    public String addTest(@RequestBody Test test) {
        testService.addTest(test);
        return "test  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteTest(@RequestBody long id) {
        testService.deleteTest(id);
        return "test deleted";
    }

    @GetMapping(value = "/all")
    private List<Test> getAllTests() {
        return testService.getAllTests();

    }
}
