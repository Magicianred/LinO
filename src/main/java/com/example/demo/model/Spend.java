package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Spend {

    @Id
    private Long id;
    private String name;
    private String category;
    private Long value;
    private Date date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "walletId", referencedColumnName = "id")
    private Wallet wallet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userGroupId", referencedColumnName = "id")
    private UserGroup userGroup;

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

    public Wallet getWallet () {
        return wallet;
    }

    public void setWallet (Wallet wallet) {
        this.wallet = wallet;
    }

    public UserGroup getUserGroup () {
        return userGroup;
    }

    public void setUserGroup (UserGroup userGroup) {
        this.userGroup = userGroup;
    }
}