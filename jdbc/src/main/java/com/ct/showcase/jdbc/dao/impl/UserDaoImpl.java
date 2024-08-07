package com.ct.showcase.jdbc.dao.impl;

import com.ct.showcase.jdbc.dao.UserDao;
import com.ct.showcase.jdbc.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("SELECT id,name,email,birthday FROM users ",
                new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User getUserById(Integer id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id = ?",
                new BeanPropertyRowMapper<>(User.class),id);
    }
}
