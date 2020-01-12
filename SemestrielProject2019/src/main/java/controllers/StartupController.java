package controllers;

import dao.documents.Startup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.StartupService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/Startup")
public class StartupController {
    @Autowired
    private StartupService startupService;

    @PostMapping(value = "/add")
    public String addStartup(@RequestBody Startup startup) {
        startupService.addStartup(startup);
        return "user  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteStartup(@RequestBody long id) {
        startupService.deleteStartup(id);
        return "Startup deleted";
    }

    @GetMapping(value = "/all")
    private List<Startup> getAllStartups() {
        return startupService.getAllStartups();
    }
}
