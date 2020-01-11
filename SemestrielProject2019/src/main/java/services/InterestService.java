package services;

import dao.documents.Interest;

import java.util.List;

public interface InterestService {
    void addInterest(Interest interest);
    List<Interest> getAllIterests();
    void deleteInterest(long id);
}
