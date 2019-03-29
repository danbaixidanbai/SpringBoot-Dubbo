package com.ouxuxi.test;


import com.ouxuxi.dao.UserDao;
import com.ouxuxi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;
    @Test
   public void testQueryListUser(){
        List<User> list=userDao.queryUserList();
        for(User u :list){
            System.out.println("id:"+u.getId());
        }
    }
}
