package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "toPay")
    private Double toPay;

    @Column(name = "toReceive")
    private Double toReceive;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    public Wallet () {};
    public Wallet (Double balance, Double toPay, Double toReceive, User user) {
        this.balance = balance;
        this.toPay = toPay;
        this.toReceive = toReceive;
        this.user = user;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

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

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }
}