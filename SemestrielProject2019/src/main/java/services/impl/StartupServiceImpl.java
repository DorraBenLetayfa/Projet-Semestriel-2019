package services.impl;

import dao.StartupDAO;
import dao.documents.Startup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.StartupService;

import java.util.List;

@Service
@Transactional
public class StartupServiceImpl implements StartupService {
    private final StartupDAO startupDAO;

    @Autowired
    public StartupServiceImpl(StartupDAO startupDAO) {
        this.startupDAO = startupDAO;
    }
    @Override
    public void addStartup(Startup startup) {

    }

    @Override
    public List<Startup> getAllStartups() {
        return null;
    }

    @Override
    public void deleteStartup(long id) {

    }
}
