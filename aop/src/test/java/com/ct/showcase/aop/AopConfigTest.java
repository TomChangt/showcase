package com.ct.showcase.aop;


import com.ct.showcase.ioc.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(AopConfig.class)
public class AopConfigTest {
    @Autowired
    private UserService userService;

    @Test
    public void testAspect() {
        assertNotNull(userService);
        userService.getUserById(1L);
    }
}
