package com.example.demo.dto;

import com.example.demo.model.UserGroup;

public class UserGroupDTO {

    private String name;
    private String description;

    public UserGroup toObject () {
        return new UserGroup(name, description);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public void printUserGroup(){
        System.out.println("Name: "+this.name);
        System.out.println("Description: "+this.description);
    }
}