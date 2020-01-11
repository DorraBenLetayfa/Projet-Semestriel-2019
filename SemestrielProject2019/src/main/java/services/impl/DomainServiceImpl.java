package services.impl;

import dao.DomainDAO;
import dao.documents.Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.DomainService;

import java.util.List;

@Service
@Transactional
public class DomainServiceImpl implements DomainService {
    private final DomainDAO domainDAO;
    @Autowired
    public DomainServiceImpl(DomainDAO domainDAO) {
        this.domainDAO = domainDAO;
    }

    @Override
    public void addDomain(Domain domain) {
domainDAO.addDomain(domain);
    }

    @Override
    public List<Domain> getAllDomains() {
        return domainDAO.getAllDomains();
    }

    @Override
    public void deleteDomain(long id) {
    domainDAO.deleteDomainById(id);
    }
}
