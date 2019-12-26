package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Wallet {

    @Id
    private Long id;
    private Double balance;
    private Double toPay;
    private Double toReceive;

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

    public Double getToPay () { return toPay; }

    public void setToPay (Double toPay) { this.toPay = toPay; }

    public Double getToReceive () { return toReceive; }

    public void setToReceive (Double toReceive) { this.toReceive = toReceive; }
}
