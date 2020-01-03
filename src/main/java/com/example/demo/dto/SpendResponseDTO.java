package com.example.demo.dto;

import com.example.demo.model.Spend;
import com.example.demo.model.UserGroup;
import com.example.demo.model.Wallet;

import java.util.Date;

public class SpendResponseDTO {

    private String name;
    private String category;
    private Long value;
    private Date date;
    private Wallet wallet;
    private UserGroup userGroup;


    public SpendResponseDTO (String name, String category, Long value, Date date, Wallet wallet, UserGroup userGroup) {
    }

    public static SpendResponseDTO toDTO (Spend spend) {

        UserGroup userGroup = null;
        Wallet wallet = null;

        UserGroup userGroupSpend = spend.getUserGroup();
        userGroup.setName(userGroupSpend.getName());
        userGroup.setDescription(userGroupSpend.getDescription());
//
//        Wallet walletSpend = spend.getWallet();
//        wallet.setId(walletSpend.getId());
//        wallet.setToReceive(walletSpend.getToReceive());
//        wallet.setToPay(walletSpend.getToPay());
//        wallet.setBalance(walletSpend.getBalance());

        return new SpendResponseDTO(spend.getName(), spend.getCategory(), spend.getValue(), spend.getDate(),spend.getWallet(),userGroup);
    }
}