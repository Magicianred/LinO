package com.example.demo.userGroup;

import com.example.demo.model.UserGroup;
import com.example.demo.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserGroupController {

    @Autowired
    private UserGroupRepository newRepository;

    /* Informa todos os grupos registrados no banco. */
    @GetMapping("/listGroup")
    public ResponseEntity<List<UserGroup>> listGroup() {
        return new ResponseEntity<List<UserGroup>>(
                newRepository.findAll(), HttpStatus.OK
        );
    }

    /* Insere um novo grupo. */
    @GetMapping("/insertGroup")
    public ResponseEntity<String> insertGroup() {
        return new ResponseEntity<String>(
                "insertGroup", HttpStatus.OK
        );
    }
}