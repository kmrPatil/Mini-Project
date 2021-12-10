package com.project.mini.controller;

import com.project.mini.Service.SweetService;
import com.project.mini.model.SweetItem;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
public class SweetController {

    @Autowired
    SweetService sweetService;

    @GetMapping("/get/allsweets")
    public List<SweetItem> getAllSweets(){
    return sweetService.getAllSweets();
    }

    @PostMapping("/add/sweets")
    public String addSweets(@RequestBody SweetItem item){

        log.info("Item object : {}",item);
        return sweetService.addSweets(item);
    }

    @PostMapping("/update/sweets/{id}")
    public String updateSweets(@PathVariable("id") String id,@RequestBody SweetItem item){
        log.info("Updating the sweets for ID : {}", id);
       return sweetService.updateSweets(id,item);
    }

}
