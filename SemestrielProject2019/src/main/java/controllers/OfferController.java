package controllers;


import dao.documents.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.OfferService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/offer")
public class OfferController {
    @Autowired
    private OfferService offerService;

    @PostMapping(value = "/add")
    public String addOffer(@RequestBody Offer offer) {
        offerService.addOffer(offer);
        return "offer  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteOffer(@RequestBody long id) {
        offerService.deleteOfferById(id);
        return "offer deleted";
    }

    @GetMapping(value = "/all")
    private List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }
}
