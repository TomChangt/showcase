package com.ct.showcase.jdbc;


import com.ct.showcase.jdbc.model.User;
import com.ct.showcase.jdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringJUnitConfig(JdbcConfig.class)
public class JdbcTest {

    @Autowired
    UserService userService;

    @Test
    public void testGetAllUsers() {
        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);
    }

    @Test
    public void testGetUserById() {
        User user = userService.getUserById(2);
        System.out.println(user);
    }

}
