package com.elliot.demo.dao;

import com.elliot.demo.domian.User;

public interface UserDao {
    public void create(User user);
    
    public User getByName(String userName);
}
