package controllers;

import dao.documents.Interest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.InterestService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/interest")
public class InterestController {
    @Autowired
    private InterestService interestService;

    @PostMapping(value = "/add")
    public String addInterest(@RequestBody Interest interest) {
        interestService.addInterest(interest);
        return "user  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteInterest(@RequestBody long id) {
        interestService.deleteInterest(id);
        return "question deleted";
    }

    @GetMapping(value = "/all")
    private List<Interest> getAllInterests() {
        return interestService.getAllIterests();
    }
}
