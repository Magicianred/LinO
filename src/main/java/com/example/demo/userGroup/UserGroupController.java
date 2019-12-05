package com.example.demo.userGroup;

import com.example.demo.model.User;
import com.example.demo.model.UserGroup;
import com.example.demo.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/userGroup")

@RestController
public class UserGroupController {

    @Autowired
    private UserGroupRepository newRepository;

    /* Informa todos os grupos registrados no banco. */
    @GetMapping
    public ResponseEntity<List<UserGroup>> listGroup() {
        return new ResponseEntity<List<UserGroup>>(
                newRepository.findAll(), HttpStatus.OK
        );
    }

    /* Insere um novo grupo. */
    @PostMapping
    public UserGroup insert(@RequestBody UserGroup userGroup) {
        return newRepository.save(userGroup);
    }
}