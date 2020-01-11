package controllers;

import dao.documents.Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.DomainService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/domain")
public class DomainController {
    @Autowired
    private DomainService domainService;

    @PostMapping(value = "/add")
    public String addDomain(@RequestBody Domain domain) {
        domainService.addDomain(domain);
        return "domain  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteDomain(@RequestBody long id) {
        domainService.deleteDomain(id);
        return "domain deleted";
    }

    @GetMapping(value = "/all")
    private List<Domain> getAllDomains() {
        return domainService.getAllDomains();
    }
}
