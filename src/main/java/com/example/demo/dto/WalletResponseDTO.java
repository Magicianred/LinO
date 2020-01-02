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


    public static WalletResponseDTO objectToDTO (Wallet wallet) {
        System.out.println("Wallet Response");
        return new WalletResponseDTO(wallet.getId(), wallet.getBalance(), wallet.getToPay(), wallet.getToReceive(), wallet.getUser());
    }
}