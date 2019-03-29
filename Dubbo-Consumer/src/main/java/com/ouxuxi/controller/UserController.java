package com.ouxuxi.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ouxuxi.entity.User;
import com.ouxuxi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping(value = "/getuser/{id}")
    private User getUser(@PathVariable("id") int id){
        log.info("consumer,port:8080");
        User user=null;
        try{
            user=userService.getUserById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
