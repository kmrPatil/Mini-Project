package com.project.mini.ServiceImpl;

import com.project.mini.Service.UserLogin;
import com.project.mini.dao.UserDao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UserLoginImpl implements UserLogin {

    @Autowired
    UserDao userDao;

    @Override
    public boolean isValidUser(String id, String pass) {
      return  userDao.isValidUser(id,pass);
    }
}
