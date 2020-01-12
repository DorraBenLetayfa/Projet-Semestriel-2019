package dao;

import dao.documents.Offer;

import java.util.List;

public interface OfferDAO {
    void addOffer(Offer offer);
    List<Offer> getAllOffers();
    Offer findOfferById(long id);
    void deleteOfferById(Long id);
}
