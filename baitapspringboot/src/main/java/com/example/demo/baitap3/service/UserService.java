package com.example.demo.baitap3.service;

import com.example.demo.baitap3.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();

    public List<User> getAllUser(){
        return userList;
    }

    public User addUser(User user) {
        userList.add(user);
        return user;
    }
}
