package com.example.demo.dto;

import com.example.demo.model.User;
import com.example.demo.model.Wallet;

public class WalletResponseDTO {

    private Double balance;
    private Double toPay;
    private Double toReceive;
    private User user;

    public WalletResponseDTO (Long id, Double balance, Double toPay, Double toReceive, User user) {
    }

    public static WalletResponseDTO fromObject (Wallet wallet) {
        System.out.println("Wallet Response");
        User user = null;
        user.setName(wallet.getUser().getName());
        user.setLogin(wallet.getUser().getLogin());
        user.setPassword(wallet.getUser().getPassword());
        return new WalletResponseDTO(wallet.getId(), wallet.getBalance(), wallet.getToPay(), wallet.getToReceive(), user);
    }


}