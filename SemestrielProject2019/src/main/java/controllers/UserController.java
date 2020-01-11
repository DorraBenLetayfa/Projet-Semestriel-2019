package controllers;


import dao.documents.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "user  created.";
    }
    @PostMapping(value = "/delete")
    public String deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
        return "user deleted";
    }

    @GetMapping(value = "/all")
    private List<User> getAllUsers() {
        return userService.getAllUsers();

    }
    @GetMapping("/auth")
    public User findUserByUserName(String userName) {
        User userElem = userService.findClientByUserName(userName);
        return userElem;
    }

}
