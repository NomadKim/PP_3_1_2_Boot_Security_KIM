package ru.kata.spring.boot_security.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.UserDaoImplementation;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;


@Service
public class UserImplem implements UserInterface{

    @Autowired
    private UserDaoImplementation userDaoImplementation;

    @Override
    public void delete(Long id) {
        userDaoImplementation.delete(id);
    }

    @Override
    public void update(User user) {
        userDaoImplementation.update(user);
    }
    @Override
    public void add(User user) {
        userDaoImplementation.add(user);
    }

    @Override
    public List<User> getListUsers() {
        return userDaoImplementation.getListUsers();
    }

    @Override
    public User getUserByUsername(String username) {
        return userDaoImplementation.getUserByUsername(username);
    }

    @Override
    public Set<Role> receiveRoles(int roles) {
        return userDaoImplementation.receiveRoles(roles);
    }
}
