package com.ct.showcase.jdbc.service.impl;

import com.ct.showcase.jdbc.dao.UserDao;
import com.ct.showcase.jdbc.model.User;
import com.ct.showcase.jdbc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
