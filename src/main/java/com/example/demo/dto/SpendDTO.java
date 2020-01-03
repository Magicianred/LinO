package com.example.demo.dto;

import com.example.demo.model.Spend;
import com.example.demo.model.UserGroup;
import com.example.demo.model.Wallet;

import java.util.Date;

public class SpendDTO {

    private String name;
    private String category;
    private Long value;
    private Date date;
    private Wallet wallet;
    private UserGroup userGroup;

    public Spend toObject () {
        System.out.println("Novosodksodksokdoskdoskdosk--------------------------");
        this.printSpend();
        Spend spend = new Spend(name, category, value,date, wallet, userGroup);
        System.out.println("Novosodksodksokdoskdoskdosk--------------------------");
        spend.printSpend();
        return spend;
    }

    public void printSpend(){
        System.out.println("DTO PRINT");
        System.out.println("Name"+this.name);
        System.out.println("Category"+this.category);
        System.out.println("Value"+this.value);
        System.out.println("Date"+this.date);
        System.out.println("Wallet"+this.wallet);
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