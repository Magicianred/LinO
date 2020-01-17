package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Spend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "value")
    private Long value;

    @Column(name = "date")
    private Date date;

    @OneToOne
    @JoinColumn(name = "payer", referencedColumnName = "id")
    private User payer;

    @OneToOne
    @JoinColumn(name = "receiver", referencedColumnName = "id")
    private User receiver;

    @OneToOne
    @JoinColumn(name = "userGroupId", referencedColumnName = "id")
    private UserGroup userGroup;

    public Spend (){};

    public Spend (String name, String category, Long value, Date date, User payer, User receiver, UserGroup userGroup) {
        this.name=name;
        this.category=category;
        this.value=value;
        this.date=date;
        this.payer=payer;
        this.receiver=receiver;
        this.userGroup=userGroup;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
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

    public void printSpend(){
        System.out.println("Name"+this.name);
        System.out.println("Category"+this.category);
        System.out.println("Value"+this.value);
        System.out.println("Date"+this.date);
        System.out.println("User How Pay"+this.payer);
        System.out.println("User How Receive"+this.receiver);
        System.out.println("userGroup"+this.userGroup);
    }
}