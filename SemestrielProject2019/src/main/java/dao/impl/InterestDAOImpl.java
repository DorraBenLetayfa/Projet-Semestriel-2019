package dao.impl;

import dao.InterestDAO;
import dao.documents.Interest;
import dao.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class InterestDAOImpl implements InterestDAO {
    final private InterestRepository interestRepository;
@Autowired
    public InterestDAOImpl(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    @Override
    public void addInterest(Interest interest) {
interestRepository.save(interest);
    }

    @Override
    public List<Interest> getAllInterests() {
        return interestRepository.findAll();
    }

    @Override
    public void deleteInterestById(Long id) {
    interestRepository.deleteById(id);

    }
}
