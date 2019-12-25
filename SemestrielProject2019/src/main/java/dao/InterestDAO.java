package dao;

import dao.documents.Interest;

import java.util.List;

public interface InterestDAO {
    void addInterest(Interest interest);
    List<Interest> getAllInterests();
    void deleteInterestById(Long id);
}
