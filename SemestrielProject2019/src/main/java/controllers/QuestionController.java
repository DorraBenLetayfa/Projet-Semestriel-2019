package controllers;

import dao.documents.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.QuestionService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping(value = "/add")
    public String addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
        return "user  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteQuestion(@RequestBody long id) {
        questionService.deleteQuestion(id);
        return "question deleted";
    }

    @GetMapping(value = "/all")
    private List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
