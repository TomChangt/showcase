package com.ct.showcase.jdbc.dao;

import com.ct.showcase.jdbc.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User getUserById(Integer id);
}
