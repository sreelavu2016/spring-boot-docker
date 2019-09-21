package com.docker.image.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.image.example.model.Users;
import com.docker.image.example.repository.UserRepository;
/*
 * Authour M1046601
 */
@RestController
@RequestMapping("/all")
public class DockerImageController {

    private UserRepository usersRepository;

    public DockerImageController(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @GetMapping("/")
    public List<Users> all() {


        return usersRepository.findAll();
    }


    @GetMapping("/create")
    public List<Users> users() {
        Users users = new Users();
        users.setId(1);
        users.setName("Sam");
        users.setSalary(3400);
        users.setTeamName("Development");

        usersRepository.save(users);

        return usersRepository.findAll();
    }
}
