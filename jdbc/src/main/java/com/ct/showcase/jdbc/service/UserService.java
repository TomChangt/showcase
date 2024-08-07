package com.ct.showcase.jdbc.service;

import com.ct.showcase.jdbc.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Integer id);
}
