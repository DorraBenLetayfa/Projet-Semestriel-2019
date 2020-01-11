package services;

import dao.documents.Group;

import java.util.List;

public interface GroupService {
    void addGroup(Group group);
    List<Group> getAllGroups();
    void deleteGroup(long id);
}
