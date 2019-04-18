package com.test.demo.service;

import com.test.demo.domain.User;
import com.test.demo.repository.UserRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(final String name, final String password) {
        return userRepository.save(new User(name, DigestUtils.sha256Hex(name+password)));
    }

}
