package services.impl;

import dao.OfferDAO;
import dao.documents.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.OfferService;

import java.util.List;

@Service
@Transactional
public class OfferServiceImpl implements OfferService {
    private final OfferDAO offerDAO;
    @Autowired
    public OfferServiceImpl(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }
    @Override
    public void addOffer(Offer offer) {
offerDAO.addOffer(offer);
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerDAO.getAllOffers();
    }

    @Override
    public Offer findOfferById(long id) {
        return offerDAO.findOfferById(id);
    }

    @Override
    public void deleteOfferById(Long id) {
     offerDAO.deleteOfferById(id);
    }
}
