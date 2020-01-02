package com.example.demo.dto;


import com.example.demo.model.User;
import com.example.demo.model.Wallet;

public class WalletDTO {

    private Double balance;
    private Double toPay;
    private Double toReceive;
    private User user;

    public Wallet fromDTO () {
        return new Wallet(balance, toPay, toReceive, user);
    }

    public void printWallet () {
        System.out.println("Balance" + this.balance);
        System.out.println("toPay" + this.toPay);
        System.out.println("toReceive" + this.toReceive);
        System.out.println("user" + this.user);
    }

    public User getUser () {
        return this.user;
    }

    public void setUser (User user) {
        this.user = user;
    }
}