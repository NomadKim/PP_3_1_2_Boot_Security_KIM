package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserDaoInterface {

    void delete(Long id);
    void update(User user);
    void add(User user);
    List<User> getListUsers();
    User getUserByUsername(String username);
    public Set<Role> receiveRoles(int roles);
}
