package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.User;
import com.github.rodolfod2r2.webflux.taskflow.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    UserServiceImp userServiceImp;

    @GetMapping(value = "/user")
    public Flux<User> getAllUser() {
        return userServiceImp.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userServiceImp.findById(id);
    }

    @PostMapping(value = "/user")
    public Mono<User> save(@RequestBody User user) {
        return userServiceImp.save(user);
    }

}
