package services;

import dao.documents.Startup;

import java.util.List;

public interface StartupService {
    void addStartup(Startup startup);
    List<Startup> getAllStartups();
    void deleteStartup(long id);

}
