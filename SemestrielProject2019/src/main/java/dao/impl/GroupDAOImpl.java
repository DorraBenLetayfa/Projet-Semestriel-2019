package dao.impl;


import dao.GroupDAO;
import dao.documents.Group;
import dao.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class GroupDAOImpl implements GroupDAO {
    final private GroupRepository groupRepository;
@Autowired
    public GroupDAOImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void addGroup(Group group) {
groupRepository.save(group);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public void deleteGroupById(Long id) {
groupRepository.deleteById(id);
    }
}
