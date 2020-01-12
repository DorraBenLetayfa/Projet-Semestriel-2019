package services;

import dao.documents.Offer;

import java.util.List;

public interface OfferService {
    void addOffer(Offer offer);
    List<Offer> getAllOffers();
    Offer findOfferById(long id);
    void deleteOfferById(Long id);
}
