package dao;

import dao.documents.Startup;

import java.util.List;

public interface StartupDAO {
    void addStartup(Startup startup);
    List<Startup> getAllStartups();
    void deleteStartupById(Long id);
}
