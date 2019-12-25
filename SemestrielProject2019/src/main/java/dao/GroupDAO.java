package dao;

import dao.documents.Group;

import java.util.List;

public interface GroupDAO {
    void addGroup(Group group);
    List<Group> getAllGroups();
    void deleteGroupById(Long id);
}
