package com.example.demo.dto;


import com.example.demo.model.UserGroup;

public class UserGroupResponseDTO {

    private String name;
    private String description;

    public UserGroupResponseDTO (String name, String description) { }

    public static UserGroupResponseDTO fromObject (UserGroup userGroup) {
        System.out.println("UserGroup Response");
        return new UserGroupResponseDTO(userGroup.getName(), userGroup.getDescription());
    }
}