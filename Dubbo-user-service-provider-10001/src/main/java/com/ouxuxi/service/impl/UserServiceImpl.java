package com.ouxuxi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ouxuxi.dao.UserDao;
import com.ouxuxi.entity.User;
import com.ouxuxi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Service
@Component
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        log.info("From user provider,method:getUserList, port 10001");
        List<User> userList = null;
        try{
            userList=userDao.queryUserList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User getUserById(int id) {
        log.info("From user provider,method:getUserById, port 10001");
        User user=null;
        try{
            user=userDao.queryUserById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
