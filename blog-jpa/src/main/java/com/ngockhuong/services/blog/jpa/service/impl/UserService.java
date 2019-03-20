package com.ngockhuong.services.blog.jpa.service.impl;

import com.ngockhuong.services.blog.jpa.repository.IUserRepository;
import com.ngockhuong.services.blog.jpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;
}
