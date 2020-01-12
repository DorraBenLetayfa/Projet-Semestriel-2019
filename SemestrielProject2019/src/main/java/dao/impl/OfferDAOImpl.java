package dao.impl;

import dao.OfferDAO;
import dao.documents.Offer;
import dao.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OfferDAOImpl implements OfferDAO{
    private final OfferRepository offerRepository;

    @Autowired
    public OfferDAOImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public void addOffer(Offer offer) {
   offerRepository.save(offer);
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    @Override
    public Offer findOfferById(long id) {
        return offerRepository.findOfferById(id);
    }

    @Override
    public void deleteOfferById(Long id) {
offerRepository.deleteById(id);
    }
}
