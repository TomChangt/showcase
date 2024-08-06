package com.ct.showcase.ioc;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void getUserById(Long id) {
        System.out.println("获取用户ID：" + id);
    }
}
