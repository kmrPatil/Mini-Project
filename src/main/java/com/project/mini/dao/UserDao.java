package com.project.mini.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public boolean isValidUser(String id, String pass);

}
