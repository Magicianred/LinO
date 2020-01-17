package com.example.demo.dto;

import com.example.demo.model.Spend;
import com.example.demo.model.User;
import com.example.demo.model.UserGroup;

import java.util.Date;

public class SpendDTO {

    private String name;
    private String category;
    private Long value;
    private Date date;
    private User payer;
    private User receiver;
    private UserGroup userGroup;

    public Spend toObject () {
        Spend spend = new Spend(name, category, value, date, payer, receiver, userGroup);
        return spend;
    }

    public void printSpend(){
        System.out.println("Name"+this.name);
        System.out.println("Category"+this.category);
        System.out.println("Value"+this.value);
        System.out.println("Date"+this.date);
        System.out.println("User"+this.payer);
        System.out.println("User"+this.receiver);
        System.out.println("userGroup"+this.userGroup);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getCategory () {
        return category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public Long getValue () {
        return value;
    }

    public void setValue (Long value) {
        this.value = value;
    }

    public Date getDate () {
        return date;
    }

    public void setDate (Date date) {
        this.date = date;
    }

    public User getPayer () {
        return payer;
    }

    public void setPayer (User payer) {
        this.payer = payer;
    }

    public User getReceiver () {
        return receiver;
    }

    public void setReceiver (User receiver) {
        this.receiver = receiver;
    }

    public UserGroup getUserGroup () {
        return userGroup;
    }

    public void setUserGroup (UserGroup userGroup) {
        this.userGroup = userGroup;
    }
}