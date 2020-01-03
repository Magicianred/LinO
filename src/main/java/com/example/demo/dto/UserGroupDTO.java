package com.example.demo.dto;

import com.example.demo.model.UserGroup;

public class UserGroupDTO {

    private String name;
    private String description;

    public UserGroup fromDTO () {
        return new UserGroup(name, description);
    }

}