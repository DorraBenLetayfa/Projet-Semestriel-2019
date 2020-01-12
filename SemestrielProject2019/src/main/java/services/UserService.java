package services;

import dao.documents.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser(User user);
    User findUserByUserName(String userName);
    void saveUser(User user);

}
