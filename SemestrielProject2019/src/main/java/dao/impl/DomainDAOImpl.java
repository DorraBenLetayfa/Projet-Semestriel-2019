package dao.impl;

import dao.DomainDAO;
import dao.documents.Domain;
import dao.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DomainDAOImpl implements DomainDAO {
    final private DomainRepository domainRepository;
@Autowired
    public DomainDAOImpl(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    @Override
    public void addDomain(Domain domain) {
        domainRepository.save(domain);
    }

    @Override
    public List<Domain> getAllDomains() {
        return domainRepository.findAll();
    }

    @Override
    public void deleteDomainById(Long id) {
domainRepository.deleteById(id);
    }
}
