package com.example.demo.dto;

import com.example.demo.model.User;
import com.example.demo.model.Wallet;

public class WalletResponseDTO {

    private Double balance;
    private Double toPay;
    private Double toReceive;
    private User user;

    public WalletResponseDTO (Double balance, Double toPay, Double toReceive, User user) {
    }

    public static WalletResponseDTO toDTO (Wallet wallet) {
        System.out.println("Wallet Response");
        User user = null;
        User userWallet = wallet.getUser();
        user.setName(userWallet.getName());
        user.setLogin(userWallet.getLogin());
        user.setPassword(userWallet.getPassword());
        return new WalletResponseDTO(wallet.getBalance(), wallet.getToPay(), wallet.getToReceive(), user);
    }
}