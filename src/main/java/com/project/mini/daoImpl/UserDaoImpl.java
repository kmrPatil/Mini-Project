package com.project.mini.daoImpl;

import com.project.mini.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public boolean isValidUser(String id, String pass) {

        Integer count= jdbcTemplate.queryForObject("SELECT COUNT(1) FROM TBL_USER WHERE userid = ? and pass = ?",Integer.class , new Object[]{id,pass});


        return count>0;
    }
}
