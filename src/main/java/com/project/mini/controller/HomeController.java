package com.project.mini.controller;

import com.project.mini.Service.UserLogin;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class HomeController {

    @Autowired
     UserLogin userLogin;

    @GetMapping("/greet")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/login/{id}/{pass}")
    public String login(@PathVariable("id") String id,@PathVariable("pass") String pass){
        Boolean isvalid = userLogin.isValidUser(id, pass);

        return isvalid?"success":"failed";
    }


}
