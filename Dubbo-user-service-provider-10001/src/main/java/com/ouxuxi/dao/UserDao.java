package com.ouxuxi.dao;



import java.util.List;
import com.ouxuxi.entity.User;

public interface UserDao {
    List<User> queryUserList();
    User queryUserById(int id);
}
