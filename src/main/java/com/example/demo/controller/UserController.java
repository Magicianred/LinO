package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /* Insert new user. */
    @PostMapping
    public User insert (@RequestBody User user) {
        return userRepository.save(user);
    }

    /* List all users */
    @GetMapping
    public ResponseEntity<List<User>> listUser () {
        return new ResponseEntity<List<User>>(
                userRepository.findAll(), HttpStatus.OK
        );
    }

    /* Find user by id */
    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById (@PathVariable Long id) {
        return userRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    /* Update user. */
    @PutMapping(value = "/{id}")
    public ResponseEntity update (@PathVariable("id") long id,
                                  @RequestBody User user) {
        return userRepository.findById(id)
                .map(record -> {
                    record.setLogin(user.getLogin());
                    record.setPassword(user.getPassword());
                    record.setName(user.getName());
                    record.setWallet(user.getWallet());
                    User updated = userRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    /* Delete user. */
    @DeleteMapping(path = {"/{id}"})
    public void delete (@PathVariable Long id) {
        userRepository.findById(id)
                .map(record -> {
                    record.setWalletNull();
                    userRepository.deleteById(id);
                    return null;
                }).orElse(ResponseEntity.notFound().build());
    }
}