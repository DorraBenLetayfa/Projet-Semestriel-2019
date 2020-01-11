package services.impl;

import dao.InterestDAO;
import dao.documents.Interest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.InterestService;

import java.util.List;

@Service
@Transactional
public class InterestServiceImpl implements InterestService {
    private final InterestDAO interestDAO;

    @Autowired
    public InterestServiceImpl(InterestDAO interestDAO) {
        this.interestDAO = interestDAO;
    }

    @Override
    public void addInterest(Interest interest) {
        interestDAO.addInterest(interest);
    }

    @Override
    public List<Interest> getAllIterests() {
        return interestDAO.getAllInterests();
    }

    @Override
    public void deleteInterest(long id) {
        interestDAO.deleteInterestById(id);

    }
}
