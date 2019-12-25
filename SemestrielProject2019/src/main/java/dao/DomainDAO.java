package dao;

import dao.documents.Domain;

import java.util.List;

public interface DomainDAO {
    void addDomain(Domain domain);
    List<Domain> getAllDomains();
    void deleteDomainById(Long id);
}
