package com.project.mini.Service;

import org.springframework.stereotype.Service;

@Service
public interface UserLogin {

    public boolean isValidUser(String id, String pass);
}
