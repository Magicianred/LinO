package com.example.demo.dto;


//import com.example.demo.model.User;
import com.example.demo.model.Wallet;

public class WalletDTO {

    private Double balance;
    private Double toPay;
    private Double toReceive;
//    private User user;

    public Wallet toObject () {
        return new Wallet(this.balance, this.toPay, this.toReceive);
    }

    public void printWallet () {
        System.out.println("Balance" + this.balance);
        System.out.println("toPay" + this.toPay);
        System.out.println("toReceive" + this.toReceive);
        //System.out.println("user" + this.user);
    }

//    public User getUser () {
//        return this.user;
//    }

//    public void setUser (User user) {
//        this.user = user;
//    }

    public Double getBalance () {
        return balance;
    }

    public void setBalance (Double balance) {
        this.balance = balance;
    }

    public Double getToPay () {
        return toPay;
    }

    public void setToPay (Double toPay) {
        this.toPay = toPay;
    }

    public Double getToReceive () {
        return toReceive;
    }

    public void setToReceive (Double toReceive) {
        this.toReceive = toReceive;
    }
}