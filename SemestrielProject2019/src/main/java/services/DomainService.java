package services;

import dao.documents.Domain;

import java.util.List;

public interface DomainService {
    void addDomain(Domain domain);
    List<Domain> getAllDomains();
    void deleteDomain(long id);
}
