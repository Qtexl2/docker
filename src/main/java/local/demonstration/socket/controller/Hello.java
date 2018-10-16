package local.demonstration.socket.controller;

import local.demonstration.socket.entity.User;
import local.demonstration.socket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ITRex Group
 */

@RestController
@RequestMapping("/")
public class Hello {

    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public String hello(){
        return "Hello world!";
    }

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUser(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody User user){
        System.out.println(user);
        return userRepository.save(user);
    }
}
