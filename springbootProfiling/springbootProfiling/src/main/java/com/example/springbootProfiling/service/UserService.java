package com.example.springbootProfiling.service;

import com.example.springbootProfiling.entity.User;
import com.example.springbootProfiling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Profile({"local", "dev", "prod"})
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
