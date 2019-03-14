package com.elliot.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.elliot.demo.domian.User;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Override
    public void create(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public User getByName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));

        return mongoTemplate.findOne(query, User.class);
    }
    
}
