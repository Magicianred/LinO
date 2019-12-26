package com.example.demo.userGroup;

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
    private UserGroupRepository userGroupRepository;

    /* List all users from group. */
    @GetMapping
    public ResponseEntity<List<UserGroup>> listGroup () {
        return new ResponseEntity<List<UserGroup>>(
                userGroupRepository.findAll(), HttpStatus.OK
        );
    }

    /* Insert user into group. */
    @PostMapping
    public UserGroup insert (@RequestBody UserGroup userGroup) {
        return userGroupRepository.save(userGroup);
    }


    /* Delete user from group */
    @DeleteMapping(path = {"/{id}"})
    public void delete (@PathVariable Long id) {
        userGroupRepository.deleteById(id);
    }

    /* Update userGroup */
    @PutMapping(value = "/{id}")
    public ResponseEntity update (@PathVariable("id") long id,
                                  @RequestBody UserGroup userGroup) {
        return userGroupRepository.findById(id)
                .map(record -> {
                    record.setName(userGroup.getName());
                    record.setDescription(userGroup.getDescription());
                    UserGroup updated = userGroupRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}