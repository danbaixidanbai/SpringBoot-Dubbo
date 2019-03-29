package com.ouxuxi.service;

import com.ouxuxi.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList();

    public User getUserById(int id);
}
