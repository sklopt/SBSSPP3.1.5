package ru.kata.spring.boot_security.pp.services;

import ru.kata.spring.boot_security.pp.dao.UserDao;
import ru.kata.spring.boot_security.pp.entities.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

    User convertToUser(UserDao userDao);
}