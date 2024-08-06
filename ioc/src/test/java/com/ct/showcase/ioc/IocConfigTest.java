package com.ct.showcase.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(IocConfig.class)
public class IocConfigTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById() {
        assertNotNull(userService);
        userService.getUserById(1L);
    }
}
