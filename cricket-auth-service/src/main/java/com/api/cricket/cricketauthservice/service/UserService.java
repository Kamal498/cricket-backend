package com.api.cricket.cricketauthservice.service;

import com.api.cricket.cricketauthservice.model.User;
import com.api.cricket.cricketauthservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUserToRepository(User user){
        return repository.save(user);
    }
}
