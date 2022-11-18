package com.example.absencemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseInitializer {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public boolean checkUserForAuthentication(String username, String password) {
        int existance = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM USERS WHERE USERNAME=\'"+username.toLowerCase()+"\' and PASSWORD=\'" + password.toLowerCase() + "\'", Integer.class);
        if (existance > 0)
            return true;
        else
            return false;
    }
}
