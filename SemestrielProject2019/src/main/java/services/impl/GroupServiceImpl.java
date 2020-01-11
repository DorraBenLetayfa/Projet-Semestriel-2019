package services.impl;

import dao.GroupDAO;
import dao.documents.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.GroupService;

import java.util.List;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

    private final GroupDAO groupDAO;

    @Autowired
    public GroupServiceImpl(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }


    @Override
    public void addGroup(Group group) {
groupDAO.addGroup(group);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupDAO.getAllGroups();
    }

    @Override
    public void deleteGroup(long id) {
        groupDAO.deleteGroupById(id);

    }
}
