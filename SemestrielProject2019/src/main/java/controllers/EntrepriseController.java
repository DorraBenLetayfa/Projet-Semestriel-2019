package controllers;

import dao.documents.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.EntrepriseService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/entreprise")
public class EntrepriseController {
    @Autowired
    private EntrepriseService entrepriseService;

    @PostMapping(value = "/add")
    public String addEntreprise(@RequestBody Entreprise entreprise) {
        entrepriseService.addEntreprise(entreprise);
        return "Entreprise  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteEntreprise(@RequestBody long id) {
        entrepriseService.deleteEntreprise(id);
        return "Entreprise deleted";
    }

    @GetMapping(value = "/all")
    private List<Entreprise> getAllEntreprises() {
        return entrepriseService.getAllEntreprises();
    }
}
