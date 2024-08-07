package com.ct.showcase.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = "com.ct.showcase.ioc")
public class IocConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
