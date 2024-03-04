package com.sjt.userService.controller;

import com.sjt.userService.entity.User;
import com.sjt.userService.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable("id") String id){
        System.out.println("test-merge2");
        System.out.println("three test");
        System.out.println("three test");
        System.out.println("three test223");
        return ResponseEntity.ofNullable(userService.findUserById(Integer.parseInt(id)));
    }
}
