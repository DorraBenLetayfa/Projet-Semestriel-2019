package controllers;

import dao.documents.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.GroupService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @PostMapping(value = "/add")
    public String addGroup(@RequestBody Group group) {
        groupService.addGroup(group);
        return "user  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteGroup(@RequestBody long id) {
        groupService.deleteGroup(id);
        return "group deleted";
    }

    @GetMapping(value = "/all")
    private List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }
}
