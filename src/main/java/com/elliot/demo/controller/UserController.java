package com.elliot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elliot.demo.dao.UserDao;
import com.elliot.demo.domian.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/create")
    public User create() {
        User user = new User();
        user.setUserName("Elliot");
        user.setPassword("elliot1201");

        userDao.create(user);

        return user;
    }

    @RequestMapping("/get-by-name")
    public User getByName() {
        return userDao.getByName("Elliot");
    }
}
