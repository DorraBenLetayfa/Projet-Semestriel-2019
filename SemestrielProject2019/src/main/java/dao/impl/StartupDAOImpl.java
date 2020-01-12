package dao.impl;

import dao.StartupDAO;
import dao.documents.Startup;
import dao.repository.StartupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StartupDAOImpl implements StartupDAO {
    private final StartupRepository startupRepository;
    @Autowired
    public StartupDAOImpl(StartupRepository startupRepository) {
        this.startupRepository = startupRepository;
    }

    @Override
    public void addStartup(Startup startup) {

    }

    @Override
    public List<Startup> getAllStartups() {
        return null;
    }

    @Override
    public void deleteStartupById(Long id) {

    }
}
