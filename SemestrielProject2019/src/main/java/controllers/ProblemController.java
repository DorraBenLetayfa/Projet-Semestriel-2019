package controllers;

import dao.documents.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ProblemService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/problem")
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    @PostMapping(value = "/add")
    public String addproblem(@RequestBody Problem problem) {
        problemService.addProblem(problem);
        return "problem  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteproblem(@RequestBody long id) {
        problemService.deleteProblem(id);
        return "problem deleted";
    }

    @GetMapping(value = "/all")
    private List<Problem> getAllproblems() {
        return problemService.getAllProblems();
    }
}

