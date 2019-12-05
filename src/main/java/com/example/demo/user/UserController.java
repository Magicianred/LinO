package com.example.demo.user;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")

@RestController
public class UserController {

    @Autowired
    private UserRepository newRepository;

    /* Informa todos usuários registrados no banco. */
    @GetMapping
    public ResponseEntity<List<User>> listUser() {
        return new ResponseEntity<List<User>>(
                newRepository.findAll(), HttpStatus.OK
        );
    }

    /* Insere um novo usuário. */
    @PostMapping
    public User insert(@RequestBody User user) {
        System.out.println(user);
        return newRepository.save(user);
    }

    /* Atualiza o usuário. */
    @PutMapping
    public ResponseEntity<String> updateUser() {
        return new ResponseEntity<String>(
                "updateUser", HttpStatus.OK
        );
    }
}
