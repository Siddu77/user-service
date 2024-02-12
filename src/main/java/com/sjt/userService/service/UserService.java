package com.sjt.userService.service;

import com.sjt.userService.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Optional<User> findUserById(Integer id);

    User addUser(User user);

    List<User> getUsers();
}
